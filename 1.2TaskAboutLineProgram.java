package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //double a=2;
        //double b=1;
        //double c=5;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        double answ=(((b+Math.sqrt((b*b)+(4*a*c)))/(2*a))-Math.pow(a,2)*c + Math.pow(b,-2));
        System.out.println("Answer " + answ);
    }
}
