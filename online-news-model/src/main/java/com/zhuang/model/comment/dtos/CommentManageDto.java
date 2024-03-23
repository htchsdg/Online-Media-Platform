package com.zhuang.model.comment.dtos;

import com.zhuang.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class CommentManageDto extends PageRequestDto {

    /**
     * 文章id
     */
    private Long articleId;
}
