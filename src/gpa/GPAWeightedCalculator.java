package gpa;

import java.util.Scanner;

public class GPAWeightedCalculator {

	public static void ol() {

	}

	// method calculating weightedGPA
	public static void calculateWeighted() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This will calculate your weighted GPA");
		System.out.println("These are the classes taken into account for weighted GPA:");
		System.out.println("");
		String[] classes = new String[3];
		classes[0] = "AP";// initialization
		classes[1] = "PAP";
		classes[2] = "On Level";
		for (String x : classes) {
			System.out.println(x);
		}

		System.out.println("");

		// while loop that will run through all eight of their classes
		int run = 1;
		double totalPoints = 0;
		double num = 8.0;
		while (run <= num) {
			// asking them for each class calculation what type of class it is - ISSUE HERE
			System.out.println("\nFor class " + run + ": " + "\n- Type AP if it's an Advanced Placement class, "
					+ "\n- Type PAP if it's a Pre-Advanced Placement class" + "\n- Type OL if it's an Onlevel class");
			String choice = keyboard.nextLine();
			double points = 0;
			// if it's on-level, it will run this if statement
			if (choice.equalsIgnoreCase("OL")) {

				System.out.println("what is your numeric grade for class " + run);
				int grade = keyboard.nextInt();
				keyboard.nextLine();
				if (grade == 100) {
					points = 5;
					System.out.println("points for class " + run + ": " + points);
				} else if (grade <= 70) {
					points = 0;
					System.out.println("points for class " + run + ": " + points);
				} else {

					int value = 100 - grade;
					double valueTaken = value / 10.0;
					points = 5 - valueTaken;
					System.out.println("points for class " + run + ": " + points);
				}
			}
			// if it's and advanced class, it will go run this if statement
			else if (choice.equalsIgnoreCase("PAP")) {
				System.out.println("what is your numeric grade for class " + run);
				int grade = keyboard.nextInt();
				keyboard.nextLine();
				if (grade == 100) {
					points = 5.5;
					System.out.println("points for class " + run + ": " + points);
				} else if (grade <= 70) {
					points = 0;
					System.out.println("points for class " + run + ": " + points);
				} else {

					int value = 100 - grade;
					double valueTaken = value / 10.0;
					points = 5.5 - valueTaken;
					System.out.println("points for class " + run + ": " + points);
				}
			}

			// if its AP then it will run this if statement
			else if (choice.equalsIgnoreCase("AP")) {

				System.out.println("what is your numeric grade for class " + run);
				int grade = keyboard.nextInt();
				keyboard.nextLine();
				if (grade == 100) {
					points = 6;
					System.out.println("points for class " + run + ": " + points);
				} else if (grade <= 70) {
					points = 0;
					System.out.println("points for class " + run + ": " + points);
				} else {

					int value = 100 - grade;
					double valueTaken = value / 10.0;
					points = 6 - valueTaken;
					System.out.println("points for class " + run + ": " + points);
				}
			}
			totalPoints += points;

			run++;

		}

		double averagePoints = totalPoints / num;
		System.out.println("Your weighted GPA is: " + averagePoints);
	}

}
