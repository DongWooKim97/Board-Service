package com.practice.boundedContext.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String showHome() {
        return "하라고ㄴㄴ이~";
    }
}
