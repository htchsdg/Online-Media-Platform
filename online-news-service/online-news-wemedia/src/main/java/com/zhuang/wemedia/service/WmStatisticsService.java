package com.zhuang.wemedia.service;

import com.zhuang.model.common.dtos.PageResponseResult;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.wemedia.dtos.StatisticsDto;

public interface WmStatisticsService {

    /**
     * 图文统计
     * @param beginDate
     * @param endDate
     * @return
     */
    public ResponseResult newsDimension(String beginDate, String endDate);

    /**
     * 分页查询图文统计
     * @param dto
     * @return
     */
    PageResponseResult newsPage(StatisticsDto dto);
}
