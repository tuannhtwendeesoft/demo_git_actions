package com.example.demo_git_actions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @Value("${redis.port}")
    private String texxt;

    @GetMapping(value = "health-check")
    public String healCheck() {
        return "check check check hello kitty" + texxt;
    }
}
