package org.example;

import java.util.List;

public class OnesAndZeros {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        //reduce method is used to reduce the elements of a stream to a single value
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

}
