package com.zhuang.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.wemedia.dtos.WmLoginDto;
import com.zhuang.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}