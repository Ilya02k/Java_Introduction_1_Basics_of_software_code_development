package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);// задача решена с учетом того что ряд начинается с элемента а1 а не нулевого
        System.out.println("Input e ");
        double e=in.nextFloat();
        int n = 0;
        double sum=0.0;
        double a=0.0;
        double a1 = (1 / Math.pow(2, 1)) + (1 / Math.pow(3, 1));
        if (a1 >= e) {
            a=a1;
            sum+=a1;
            n=1;
            while (a>= e) {
                n++;
                a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
                sum+= a;
            }
            System.out.println("Sum= " +sum);
        }
        else {
            System.out.println("You entered e>a1 ");
        }

    }
}