package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input top1 of the triangle ");
        int top1 = in.nextInt();
        System.out.print("Input top2 of the triangle ");
        int top2 = in.nextInt();
        int flag=1;
        if (top1 <= 0 || top2 <= 0) flag = 0;
        switch (flag) {
            case 1:
                System.out.println("Triangle exists");
            case 2:
                if (top1 + top2 == 90 || top1 == 90 || top2 == 90) {
                    System.out.println("The triangle is rectangular");
                    break;
                } else {
                    System.out.println("The triangle is not rectangular");
                    break;
                }
            default:
                throw new IllegalArgumentException("The triangle isnt's exists ");
        }

    }
}
