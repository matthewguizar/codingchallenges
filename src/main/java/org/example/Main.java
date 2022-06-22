package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.OnesAndZeros.ConvertBinaryArrayToInt;
import static org.example.PaperChallenge.Paper.paperWork;
import static org.example.StringToArray.stringToArray;

public class Main {
    public static void main(String[] args) {
        System.out.println(paperWork(5,5));

        List<Integer> binary = new ArrayList<>(Arrays.asList(1,0,1,0,1,1,1));
        System.out.println(ConvertBinaryArrayToInt(binary));
        String string = "hello world";
        System.out.println(stringToArray(string));




    }

}