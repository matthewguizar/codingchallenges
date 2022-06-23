package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.InvertValues.invert;
import static org.example.KeepHydrated.liters;
import static org.example.NextPerfectSquare.findNextSquare;
import static org.example.OnesAndZeros.ConvertBinaryArrayToInt;
import static org.example.PaperChallenge.Paper.paperWork;
import static org.example.StringToArray.stringToArray;

public class Main {
    public static void main(String[] args) {
        System.out.println(paperWork(5,5));

        List<Integer> binary = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,1));
        System.out.println(ConvertBinaryArrayToInt(binary));

        String string = "hello world";
        System.out.println(Arrays.toString(stringToArray(string)));

        System.out.println(findNextSquare(114));

        System.out.println(liters(6.7));

        int[] array = new int[]{1,2,-4};
        System.out.println(Arrays.toString(invert(array)));




    }

}