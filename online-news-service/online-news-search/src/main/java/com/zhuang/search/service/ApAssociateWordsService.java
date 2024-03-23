package com.zhuang.search.service;

import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
