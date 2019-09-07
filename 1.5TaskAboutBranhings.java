package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Input x ");
	double x=in.nextFloat();
	double y;
	if(x<=3)
    {
     y=x*x-3*x+9;
     System.out.println("Y= "+y);
    }
	else if(x>3)
    {
        y=1/(Math.pow(x,3)+6);
        System.out.println("Y= "+y);
    }
    }
}