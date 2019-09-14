package com.company;

import java.util.Arrays;

public class Denomination {
    private int[] values;

    Denomination(int[] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
