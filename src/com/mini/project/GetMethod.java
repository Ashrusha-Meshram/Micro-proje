package com.mini.project;

import java.util.Scanner;

public class GetMethod implements Addition, Substraction, Multiplication, Division, Modulus, SquareNumber, CubeNumbers,
		AverageValues, Factors, EvenOddNumber {

	@Override
	public int additon() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number >>");
		int add1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int add2 = scan.nextInt();
		int add = add1 + add2;
		System.out.println("Addtion is>> " + (add));
		return add;

	}

	@Override
	public int substract() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number >>");
		int sub1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int sub2 = scan.nextInt();
		int sub = sub1 - sub2;
		System.out.println("substraction is>> " + sub);
		return sub;

	}

	@Override
	public int multiply() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number >>");
		int no1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int no2 = scan.nextInt();
		int mul = no1 * no2;
		System.out.println("Multiplication is>> " + (mul));
		return mul;

	}

	@Override
	public int division() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number >>");
		int div1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int div2 = scan.nextInt();
		int div = div1 / div2;
		System.out.println("Divison is>> " + div);
		try {
			int g = div1 / div2;
		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.exit(div);
		}
		return div;

	}

	@Override
	public int moduls() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number >>");
		int n1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int n2 = scan.nextInt();
		int mod = n1 % n2;
		System.out.println("Modulus is>> " + mod);
		return mod;

	}

	@Override
	public int square() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number >>");
		int num = scan.nextInt();
		int sq = num * num;
		System.out.println("Square of the number is>> " + (sq));
		return sq;

	}

	@Override
	public int cube() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number >>");
		int no = scan.nextInt();
		int cube = no * no * no;
		System.out.println("Cube of the Number is>>" + cube);
		return cube;

	}

	@Override
	public int average() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number >>");
		int num1 = scan.nextInt();

		System.out.println("Enter second number >>");
		int num2 = scan.nextInt();

		System.out.println("Enter first number >>");
		int num3 = scan.nextInt();

		System.out.println("Enter second number >>");
		int num4 = scan.nextInt();

		System.out.println("Enter first number >>");
		int num5 = scan.nextInt();

		int total = num1 + num2 + num3 + num4 + num5;
		int avg = total / 5;

		System.out.println("Average value is>>" + avg);
		return avg;

	}

	@Override
	public int factors() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number is ");
		int number = scan.nextInt();
		System.out.println(" factors are" + number);
		int i = 1;
		while (i <= number)

		{
			if (number % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		return i;
	}

	@Override
	public int evenOdd() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scan.nextInt();

		for (int i = number; i <= number; i++) {
			if ((i % 2) == 0) {
				System.out.println(" number is even >>" + i);
			} else {
				System.out.println(" Number is odd ");
			}
		}
		return number;
	}
}
