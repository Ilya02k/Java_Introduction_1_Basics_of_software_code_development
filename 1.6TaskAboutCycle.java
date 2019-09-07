package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        System.out.println(" Input m and n: ");
        m = in.nextInt();
        n = in.nextInt();
        while (m <= n) {
            System.out.print(m + ": ");
            for (int i = 2; i < m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            m += 1;
        }

    }
}
