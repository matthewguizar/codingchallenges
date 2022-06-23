package org.example;

public class NextPerfectSquare {
    public static long findNextSquare(long sq) {
        long nextN = (long) Math.floor(Math.sqrt(sq));
        return nextN * nextN == sq ? (nextN + 1) * (nextN + 1) : -1;
    }
}
