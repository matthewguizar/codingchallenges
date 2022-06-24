package org.example;

public class NextPerfectSquare {
    public static long findNextSquare(long sq) {
        // creating variable that squares the input
        long nextN = (long) Math.floor(Math.sqrt(sq));
        //checking if squared number is a perfect squared when multiplied by itself
        //if it is then the next perfect square is given if not then -1 it given
        return nextN * nextN == sq ? (nextN + 1) * (nextN + 1) : -1;
    }
}
