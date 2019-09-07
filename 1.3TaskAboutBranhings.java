package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("Input coordinates of A ");
	int x1=in.nextInt();
	int y1=in.nextInt();
	System.out.println("Input coordinates of B ");
	int x2=in.nextInt();
	int y2=in.nextInt();
	System.out.println("Input coordinates of C ");
	int x3=in.nextInt();
	int y3=in.nextInt();
	if((x3-x1)/(x2-x1)==(y3-y1)/(y2-y1))
	{
		System.out.println("A, B, C lie on one line ");
	}
	else
	{
		System.out.println("A, B, C don't lie on one line ");

	}
    }
}
