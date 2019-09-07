package com.company;

import java.util.Scanner;


public class SixthTask {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x:");
        x = in.nextInt();
        System.out.print("Enter y:");
        y = in.nextInt();
        if ((x>4)||(x<-4)||(y>4)||(y<-3))
            System.out.println("false");
        else
            System.out.println("true");
    }
}
