package com.abanul.swager.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @ApiOperation(value = "Patch articles")
    @GetMapping
    public String getUserName(){
        return "Name";
    }
}
