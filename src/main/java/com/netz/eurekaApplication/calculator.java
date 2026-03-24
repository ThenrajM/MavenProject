package com.netz.eurekaApplication;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        
        System.out.println("NEW: " + div);

    }
	
	public void method1() {
    System.out.println("Multiplication: ");
    System.out.println("Division: ");
	}

	public void method2() {
	    System.out.println("Multiplication: ");
	    System.out.println("Division: ");
		}
	
	public void method3() {
	    System.out.println("Multiplication: ");
	    System.out.println("Division: ");
		}
	
	public void method4() {
	    System.out.println("Multiplication: ");
	    System.out.println("Division: ");
		}

	

}
