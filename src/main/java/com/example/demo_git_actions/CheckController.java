package com.example.demo_git_actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @GetMapping(value = "health-check")
    public String healCheck() {
        return "abc 123 456 33 test test test tuannh 123 321";
    }
}
