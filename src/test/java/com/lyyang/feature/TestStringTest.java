package com.lyyang.feature;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestStringTest {

    TestString testString = new TestString();
    @Test
    void getBlockSring() {
        log.info("HIHI:{}", testString.getBlockSring());
    }
}