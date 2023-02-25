package gpa;

import java.util.ArrayList;
import java.util.Scanner;

public class GPAUnweightedCalculator {

	// calculation for unweighted gpa
	public static void calculateUnweighted() {

		Scanner keyboard = new Scanner(System.in);
		// while loop that will run through all eight classes
		int run = 1;
		double totalPoints = 0;
		double num = 8;
		while (run <= num) {
			// telling whsich class it's the calculation for depending on where the loop is
			// at
			System.out.println("\nCalculation for class " + run + ": ");
			// giving options for input
			System.out.println("Enter your letter grade. Options: ");
			ArrayList<String> gradeOptions = new ArrayList<String>();
			gradeOptions.add("A+");
			gradeOptions.add("A-");
			gradeOptions.add("A");
			gradeOptions.add("B+");
			gradeOptions.add("B");
			gradeOptions.add("B-");
			gradeOptions.add("C+");
			gradeOptions.add("C");
			gradeOptions.add("C-");
			gradeOptions.add("D+");
			gradeOptions.add("D");
			gradeOptions.add("F");

			for (String Options : gradeOptions) {
				System.out.print(Options + ", ");

			}

			String grade = keyboard.nextLine();
			double points = 0;
			// depending on what the user's input is, different statements will run
			if (grade.equalsIgnoreCase("A+") || grade.equalsIgnoreCase("A")) {
				points = 4;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("A-")) {
				points = 3.7;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("B+")) {
				points = 3.3;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("B")) {
				points = 3;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("B-")) {
				points = 2.7;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("C+")) {
				points = 2.3;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("C")) {
				points = 2;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("C-")) {
				points = 1.7;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("D+")) {
				points = 1.3;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("D")) {
				points = 1;
				System.out.println("\npoints for class " + run + ": " + points);
			} else if (grade.equalsIgnoreCase("F")) {
				points = 0;
				System.out.println("\npoints for class " + run + ": " + points);
			} else {
				System.out.println("INVALID INPUT :(");
				// System.out.println("Try the whole thing again:");
				// unweighted();
			}
			totalPoints += points;
			run++;
			// I need to figure out how to calculate the gpa
		}
		double averagePoints = totalPoints / num;
		System.out.println("Your unweighted GPA is: " + averagePoints);

	}

}
