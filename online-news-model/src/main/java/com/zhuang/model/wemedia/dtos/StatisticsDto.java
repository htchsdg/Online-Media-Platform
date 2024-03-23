package com.zhuang.model.wemedia.dtos;

import com.zhuang.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class StatisticsDto extends PageRequestDto {

    private String beginDate;
    private String endDate;
    private Integer wmUserId;
}
