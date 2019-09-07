package com.company;

public class Main {

    public static void main(String[] args) {
        double val=145.345;
        val=(int)val/1000.0 +Math.ceil((val-(int)(val))*1000);
        System.out.println("Value " + val);
    }
}
