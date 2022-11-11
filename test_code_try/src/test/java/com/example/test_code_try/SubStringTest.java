package com.example.test_code_try;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStringTest {

    @Test
    void 괄호_없애기_테스트() {
        String num = "(1,2)";
        assertEquals(num.substring(1,4),"1,2");
    }
}