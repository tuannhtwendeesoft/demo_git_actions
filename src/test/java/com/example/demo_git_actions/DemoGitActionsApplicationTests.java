package com.example.demo_git_actions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoGitActionsApplicationTests {

    @Test
    void contextLoads() {
        Boolean check = false;
        Assertions.assertThat(check)
                .isEqualTo(true);
    }

}
