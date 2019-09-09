package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    long a ,b,c;
    int d;
    Scanner in=new Scanner(System.in);
	System.out.println("Input a and b: ");
	a=in.nextInt();
	b=in.nextInt();
	System.out.println("Output: ");
	while(a>0) {
	    d= (int) (a%10);
	    a/=10;
	    c=b;
	    while(c>0)
        {
            if(c%10==d)
            {
                System.out.println(d+" ");
                break;
            }
            c/=10;
        }
    }

    }
}
