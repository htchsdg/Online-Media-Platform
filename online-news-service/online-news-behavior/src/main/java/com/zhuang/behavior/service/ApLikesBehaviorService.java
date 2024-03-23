package com.zhuang.behavior.service;

import com.zhuang.model.behavior.dtos.LikesBehaviorDto;
import com.zhuang.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
