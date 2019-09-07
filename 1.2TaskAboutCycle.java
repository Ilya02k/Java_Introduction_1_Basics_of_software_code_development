package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Input h ");
	int h=in.nextInt();
	//int a,b;
	System.out.println("Input a, b ");
	int a=in.nextInt();
	int b=in.nextInt();
	int y=0;
	System.out.print("Value of function: ");
	for(int a1=a;a1<=b;a1+=h)
    {
        if(a1>2)
        {
            y=a1;
            System.out.print(y+" ");
        }
        else if(a1<=2)
        {
            y=a1*(-1);
            System.out.print(y+" ");
        }
    }

    }
}
