package javaBasic;

import java.util.Scanner;

public class sumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("sum of two numbers = " + (a+b));
	}

}
