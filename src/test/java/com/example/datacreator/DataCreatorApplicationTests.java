package com.example.datacreator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataCreatorApplicationTests {

    @Test
    void contextLoads() {
        boolean t = true;

        Assertions.assertThat(t).isTrue();
    }

}
