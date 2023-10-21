package com.mini.project;

import java.util.Scanner;

public class Calculations extends GetMethod implements Factors, EvenOddNumber {

	public static void main(String[] args) {

		System.out.println("CHOOSE THE FUNCTION ORDER ACCORDING TO YOUR PREFERENCE");

		System.out.println("1. Addition of two Number");
		System.out.println("2. Substraction of two Number");
		System.out.println("3. Multiplication of two number");
		System.out.println("4. Division of two number");
		System.out.println("5. Modulus of two Number");
		System.out.println("6. Square of number");
		System.out.println("7. Cube of number");
		System.out.println("8. Average of five numbers");
		System.out.println("9. Even or Odd Number");
		System.out.println("10. Factors of Number");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice >>");
		int function = scan.nextInt();

		int functionality;
		GetMethod get = new GetMethod();

		switch (function) {

		case 1:
			functionality = get.additon();
			break;
		case 2:
			functionality = get.substract();
			break;
		case 3:
			functionality = get.multiply();
			break;

		case 4:
			functionality = get.division();
			break;

		case 5:
			functionality = get.moduls();
			break;

		case 6:
			functionality = get.square();
			break;

		case 7:
			functionality = get.cube();
			break;

		case 8:
			functionality = get.average();
			break;

		case 9:
			functionality = get.evenOdd();
			break;

		case 10:
			functionality = get.factors();
			break;
		}

	}

}
