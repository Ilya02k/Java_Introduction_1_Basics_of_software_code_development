package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A and B ");
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println("Input  x,y,z of brick ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        boolean flag;
        if ((x < A && y < B) || (x < B && y < A)) {
            System.out.println("Brick enter in hole ");
            return;
        }
        if ((x < A && z < B) || (x < B && z < A)) {
            System.out.println("Brick enter in hole ");
            return;
        }
        if ((z < A && y < B) || (z < B && y < A)) {
            System.out.println("Brick enter in hole ");
            return;
        } else {
            System.out.println("Brick cannot enter in hole ");
        }
    }
}
