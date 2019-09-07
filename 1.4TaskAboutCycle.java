package com.company;

import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        BigInteger pr=BigInteger.valueOf(1);
        for(int i=1;i<=200;i++)
        {
           int kv=i*i;
            pr=pr.multiply(BigInteger.valueOf(kv));
        }
        System.out.println("Pr= "+pr);
    }
}
