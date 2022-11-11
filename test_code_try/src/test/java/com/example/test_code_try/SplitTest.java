package com.example.test_code_try;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitTest {
    @Test
    void 쉼표로_나누기_테스트() {
        Assertions.assertThat("1,2".split(",")).contains("1","2","2");
        Assertions.assertThat("1".split(",")).containsExactly("1");
        Assertions.assertThat("1,2,3".split(",")).containsExactly("1","2","3");
    }
}

