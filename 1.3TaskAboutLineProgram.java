package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 2.0D;
        double y = 1.0D;
        double answ= ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("Answer " + answ);
    }

}
