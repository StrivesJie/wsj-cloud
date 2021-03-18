package com.wsj;

import com.wsj.entity.EsmResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wsj
 * @Date: 2021/3/18 13
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("wsj")
    public EsmResponse getTest(){
        return new EsmResponse().message("success");
    }
}
