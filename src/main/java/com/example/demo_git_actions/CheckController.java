package com.example.demo_git_actions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CheckController {

    @GetMapping(value = "health-check")
    public String healCheck() {
        String text = """
                Name: %s
                Date: %s
                """.formatted("Nguyễn Hữu Tuấn", new Date());

        return "check check check hello kitty" + text;
    }
}
