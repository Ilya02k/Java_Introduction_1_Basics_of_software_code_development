package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int seconds = in.nextInt();
        int hours=seconds/3600;
        int minutes=seconds/60;
        System.out.println("HH MM SS " + hours+ " "+minutes+ " "+ seconds);
    }
}
