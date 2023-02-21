package com.lzr.controller;

import com.lzr.result.JsonResult;
import com.lzr.result.ResultTool;
import com.lzr.service.ArticleService;
import com.lzr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lzr
 * @Date 2023/2/21 9:43
 * @Description: test
 */

@RestController
public class TestController {

    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;
    @GetMapping("/text")
    public JsonResult tt(){
        return ResultTool.success(userService.getUserByName("admin"));

    }
}
