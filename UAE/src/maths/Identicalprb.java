package maths;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Identicalprb {
	private static Scanner scanner;

	public static void main(String[] args) {
	    try {
	        System.out.println("please enter the number of ball in bag : ");
	        scanner = new Scanner(System.in);
	        int balls = scanner.nextInt();
	        System.out.println("Total Number of ways to remove balls  : " + calculate(balls));
	    } catch (InputMismatchException e) {
	        throw new InputMismatchException("please enter a numeric value");
	    }
	}

	private static int calculate(int balls) {
	    switch (balls) {
	        case 0:
	            return 0;
	        case 1:
	            return 1;
	        case 2:
	            return 2;
	        default:
	            return calculate(balls - 1) + calculate(balls - 2);
	    }
	}
}
