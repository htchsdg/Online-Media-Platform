package com.zhuang.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.user.dtos.AuthDto;
import com.zhuang.model.user.pojos.ApUserRealname;

public interface ApUserRealnameService extends IService<ApUserRealname> {

    /**
     * 按照状态分页查询用户列表
     * @param dto
     * @return
     */
    public ResponseResult loadListByStatus(AuthDto dto);

    /**
     *
     * @param dto
     * @param status  2审核失败    9审核成功
     * @return
     */
    public ResponseResult updateStatus(AuthDto dto,Short status);

}