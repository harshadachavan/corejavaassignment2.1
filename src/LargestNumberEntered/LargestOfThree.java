package LargestNumberEntered;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	System.out.println("The program finds largest of 3 numbers  \n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number :");
    int a = sc.nextInt();
    System.out.println("Enter Second Number :");
    int b = sc.nextInt();
    System.out.println("Enter Third Number :");
    int c = sc.nextInt();
    
	    if(a > b && a > c) {
	    	System.out.println("The Largest number of "+a+", "+b+" and "+c+" is :"+a);
	    }
	    if(b > c && b > a) {
	    	System.out.println("The Largest number of "+a+", "+b+" and "+c+" is :"+b);
	    }
	    if(c > a && c > b) {
	    	System.out.println("The Largest number of "+a+", "+b+" and "+c+" is :"+c);
	    }
    }
}

