package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Input value ");
        int k=in.nextInt();
        int sum = 0;
        for(int n=1;n<k;n++)//до введенного числа, само число не включается же?
        {
          sum+=n;
        }
        System.out.println("Sum= "+sum);
    }
    }