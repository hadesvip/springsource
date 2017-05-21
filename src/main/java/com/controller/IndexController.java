package com.controller;

import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangyong on 2017/5/21.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        System.out.println("index...");

        return "index";
    }


    @GetMapping("/getUser")
    @ResponseBody
    public User getUser() {

        return new User("admin", "一个简单的用户");
    }

}
