package org.example;

public class KeepHydrated {
    public static int liters(double time) {
        //person but drink .5 water every hour, so we multiply the time to get answer and convert to int
        return (int) (time * 0.5);
    }
}
