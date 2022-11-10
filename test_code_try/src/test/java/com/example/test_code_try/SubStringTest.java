package com.example.test_code_try;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStringTest {

    @Test
    void main() {
        String num = "(1,2)";
        assertEquals(num.substring(1,4),"1,2");
    }
}