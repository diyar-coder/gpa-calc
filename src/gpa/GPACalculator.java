package gpa;

import java.util.ArrayList;
import java.util.Scanner;

public class GPACalculator {

	public static int numClasses = 8;

	public static void run() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the GPA calculator!");
		System.out.println("Do you want your weighted or unweighted GPA? "
				+ "Type weighted or unweighted once you've made a decesion: ");
		String calculate = keyboard.nextLine();

		if (calculate.equals("weighted")) {
			GPAWeightedCalculator.calculateWeighted();
		}

		if (calculate.equals("unweighted")) {
			GPAUnweightedCalculator.calculateUnweighted();
		} // CodePLSWorkThanksBae
	}

}