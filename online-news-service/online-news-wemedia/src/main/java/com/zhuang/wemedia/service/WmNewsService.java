package com.zhuang.wemedia.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.wemedia.dtos.NewsAuthDto;
import com.zhuang.model.wemedia.dtos.WmNewsDto;
import com.zhuang.model.wemedia.dtos.WmNewsPageReqDto;
import com.zhuang.model.wemedia.pojos.WmNews;

public interface WmNewsService extends IService<WmNews> {

    /**
     * 查询文章
     * @param dto
     * @return
     */
    public ResponseResult findAll(WmNewsPageReqDto dto);

    /**
     *  发布文章或保存草稿
     * @param dto
     * @return
     */
    public ResponseResult submitNews(WmNewsDto dto);

    /**
     * 查询文章详情
     * @param id
     * @return
     */
    public ResponseResult findOne(Integer id);

    /**
     * 文章的上下架
     * @param dto
     * @return
     */
    public ResponseResult downOrUp(WmNewsDto dto);

    /**
     * 查询文章列表
     * @param dto
     * @return
     */
    public ResponseResult findList(NewsAuthDto dto);

    /**
     * 查询文章详情
     * @param id
     * @return
     */
    public ResponseResult findWmNewsVo(Integer id);

    /**
     * 文章审核，修改状态
     * @param status  2  审核失败  4 审核成功
     * @param dto
     * @return
     */
    public ResponseResult updateStatus(Short status ,NewsAuthDto dto);
}