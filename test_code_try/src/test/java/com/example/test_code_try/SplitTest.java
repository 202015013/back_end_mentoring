package com.example.test_code_try;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitTest {

    SplitNum splitNum = new SplitNum();

    @Test
    void testSplit() {
        Assertions.assertThat("1,2".split(",")).contains("1");
    }
}

