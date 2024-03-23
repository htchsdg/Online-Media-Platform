package com.zhuang.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuang.model.wemedia.dtos.NewsAuthDto;
import com.zhuang.model.wemedia.pojos.WmNews;
import com.zhuang.model.wemedia.vo.WmNewsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WmNewsMapper  extends BaseMapper<WmNews> {

    List<WmNewsVo> findListAndPage(@Param("dto") NewsAuthDto dto);

    int findListCount(@Param("dto") NewsAuthDto dto);
}