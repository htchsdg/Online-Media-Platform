package com.zhuang.model.article.dtos;

import com.zhuang.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class ArticleCommentDto extends PageRequestDto {

    private String beginDate;
    private String endDate;
    private Integer wmUserId;
}
