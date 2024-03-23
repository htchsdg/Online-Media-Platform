package com.zhuang.user.service;


import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.user.dtos.UserRelationDto;


public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}