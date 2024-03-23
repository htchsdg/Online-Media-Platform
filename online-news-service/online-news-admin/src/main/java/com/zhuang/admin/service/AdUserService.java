package com.zhuang.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.model.admin.dtos.AdUserDto;
import com.zhuang.model.admin.pojos.AdUser;
import com.zhuang.model.common.dtos.ResponseResult;

public interface AdUserService extends IService<AdUser> {

    /**
     * 登录
     * @param dto
     * @return
     */
    public ResponseResult login(AdUserDto dto);
}
