package com.zhuang.behavior.service;

import com.zhuang.model.behavior.dtos.ReadBehaviorDto;
import com.zhuang.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
