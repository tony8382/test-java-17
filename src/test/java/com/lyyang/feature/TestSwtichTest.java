package com.lyyang.feature;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestSwtichTest {

    TestSwtich testSwtich = new TestSwtich();

    @Test
    void getString() {
        try {
            log.info("GG:{}", testSwtich.getString(2));
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}