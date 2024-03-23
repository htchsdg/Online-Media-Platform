package com.zhuang.user.service.impl;

import com.zhuang.common.constants.BehaviorConstants;
import com.zhuang.common.redis.CacheService;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.common.enums.AppHttpCodeEnum;
import com.zhuang.model.user.dtos.UserRelationDto;
import com.zhuang.model.user.pojos.ApUser;
import com.zhuang.user.service.ApUserRelationService;
import com.zhuang.utils.thread.AppThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApUserRelationServiceImpl implements ApUserRelationService {

    @Autowired
    private CacheService cacheService;


    /**
     * 用户关注/取消关注
     *
     * @param dto
     * @return
     */
    @Override
    public ResponseResult follow(UserRelationDto dto) {
        //1 参数校验
        if (dto.getOperation() == null || dto.getOperation() < 0 || dto.getOperation() > 1) {
            return ResponseResult.errorResult(AppHttpCodeEnum.PARAM_INVALID);
        }

        //2 判断是否登录
        ApUser user = AppThreadLocalUtil.getUser();
        if (user == null) {
            return ResponseResult.errorResult(AppHttpCodeEnum.NEED_LOGIN);
        }
        Integer apUserId = user.getId();

        //3 关注 apuser:follow:  apuser:fans:
        Integer followUserId = dto.getAuthorId();
        if (dto.getOperation() == 0) {
            // 将对方写入我的关注中
            cacheService.zAdd(BehaviorConstants.APUSER_FOLLOW_RELATION + apUserId, followUserId.toString(), System.currentTimeMillis());
            // 将我写入对方的粉丝中
            cacheService.zAdd(BehaviorConstants.APUSER_FANS_RELATION+ followUserId, apUserId.toString(), System.currentTimeMillis());

        } else {
            // 取消关注
            cacheService.zRemove(BehaviorConstants.APUSER_FOLLOW_RELATION + apUserId, followUserId.toString());
            cacheService.zRemove(BehaviorConstants.APUSER_FANS_RELATION + followUserId, apUserId.toString());
        }

        return ResponseResult.okResult(AppHttpCodeEnum.SUCCESS);

    }
}