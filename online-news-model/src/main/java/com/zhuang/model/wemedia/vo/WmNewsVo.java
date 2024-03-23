package com.zhuang.model.wemedia.vo;

import com.zhuang.model.wemedia.pojos.WmNews;
import lombok.Data;

@Data
public class WmNewsVo  extends WmNews {
    /**
     * 作者名称
     */
    private String authorName;
}