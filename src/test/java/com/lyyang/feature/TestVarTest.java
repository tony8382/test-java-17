package com.lyyang.feature;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class TestVarTest {

    TestVar testVar = new TestVar();

    @Test
    void getString() {
        log.info("GG:{}", testVar.getString());
    }

    @Test
    void NpeGetString() {
        TestVar testVarNPE = null;
        Assertions.assertThrows(NullPointerException.class, () -> testVarNPE.getString());
    }
}