package com.zhuang.model.user.dtos;

import com.zhuang.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class AuthDto  extends PageRequestDto {

    /**
     * 状态
     */
    private Short status;

    private Integer id;

    //驳回的信息
    private String msg;
}
