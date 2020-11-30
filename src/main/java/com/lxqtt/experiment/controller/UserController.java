package com.lxqtt.experiment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @ResponseBody
    public String helleLxqtt() {
        return "hello my brother";
    }
}
