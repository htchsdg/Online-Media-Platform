package com.zhuang.behavior.service;

import com.zhuang.model.behavior.dtos.UnLikesBehaviorDto;
import com.zhuang.model.common.dtos.ResponseResult;

/**
 * <p>
 * APP不喜欢行为表 服务类
 * </p>
 */
public interface ApUnlikesBehaviorService {

    /**
     * 不喜欢
     * @param dto
     * @return
     */
    public ResponseResult unLike(UnLikesBehaviorDto dto);

}