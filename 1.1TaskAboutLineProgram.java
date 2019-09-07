package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
    //    int a;
      //  int b;
        //int c;
        double z;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        z=(double)(((a-3)*b/2)+c);
        System.out.println("Value z="+z);
    }
}
