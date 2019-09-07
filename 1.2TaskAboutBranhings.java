package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Input a ");
	int a=in.nextInt();
	System.out.print("Input b ");
	int b=in.nextInt();
	System.out.print("Input c ");
	int c=in.nextInt();
	System.out.print("Input d ");
	int d=in.nextInt();
	int min1;
	int min2;
	int max;
	if(a<=b)
    {
        min1=a;
    }
	else
    {
         min1=b;
    }
	if(c<=d)
    {
        min2=c;
    }
	else
    {
	    min2=d;
    }
	if(min1>min2)
    {
        max=min1;
        System.out.println(" Max = "+max);

    }
	else if(min1<min2)
    {
        max=min2;
        System.out.println("Max= " +max);
    }
	else if (min1==min2)
        {
            max=min1;// если два минимальных равны между собой
            System.out.println("Max= "+max);
        }
    }
}
