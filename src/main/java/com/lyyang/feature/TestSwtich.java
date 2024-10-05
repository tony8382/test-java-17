package com.lyyang.feature;

public class TestSwtich {
    public String getString(int i) throws IllegalStateException {
        return switch (i) {
            case 1, 2, 3 -> "1";
            case 4 -> "2";
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };

    }
}
