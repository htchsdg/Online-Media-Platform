package com.zhuang.comment.service;

import com.zhuang.model.comment.dtos.CommentDto;
import com.zhuang.model.comment.dtos.CommentLikeDto;
import com.zhuang.model.comment.dtos.CommentSaveDto;
import com.zhuang.model.common.dtos.ResponseResult;

public interface CommentService {

    /**
     * 保存评论
     * @param dto
     * @return
     */
    public ResponseResult saveComment(CommentSaveDto dto);

    /**
     * 点赞
     * @param dto
     * @return
     */
    public ResponseResult like(CommentLikeDto dto);

    /**
     * 加载评论列表
     * @param dto
     * @return
     */
    public ResponseResult findByArticleId(CommentDto dto);


}
