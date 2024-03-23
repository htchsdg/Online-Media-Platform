package com.zhuang.user.controller.v1;

import com.zhuang.common.constants.UserConstants;
import com.zhuang.model.common.dtos.ResponseResult;
import com.zhuang.model.user.dtos.AuthDto;
import com.zhuang.user.service.ApUserRealnameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class ApUserRealnameController {

    @Autowired
    private ApUserRealnameService apUserRealnameService;


    @PostMapping("/list")
    public ResponseResult loadListByStatus(@RequestBody AuthDto dto){
        return apUserRealnameService.loadListByStatus(dto);
    }

    @PostMapping("/authPass")
    public ResponseResult authPass(@RequestBody AuthDto dto ){
       return apUserRealnameService.updateStatus(dto, UserConstants.PASS_AUTH);
    }

    @PostMapping("/authFail")
    public ResponseResult authFail(@RequestBody AuthDto dto ){
        return apUserRealnameService.updateStatus(dto, UserConstants.FAIL_AUTH);
    }
}
