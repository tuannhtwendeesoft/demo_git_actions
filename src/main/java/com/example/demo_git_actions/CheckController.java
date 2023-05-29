package com.example.demo_git_actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @GetMapping(value = "health-check")
    public String healCheck() {
        return "check check check";
    }
}
