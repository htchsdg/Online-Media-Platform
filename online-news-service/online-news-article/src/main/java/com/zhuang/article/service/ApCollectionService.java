package com.zhuang.article.service;

import com.zhuang.model.article.dtos.CollectionBehaviorDto;
import com.zhuang.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
