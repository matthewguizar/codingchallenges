package org.example;

public class Printer {
    public static String printerError (String s){
        //replacing letters a-m (the correct letters) and then counting what's left
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();

    }
}
