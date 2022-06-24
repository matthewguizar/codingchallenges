package org.example;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        //going through the elements of the array and mapping -i to them to convert each to its additive inverse
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
