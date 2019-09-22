import java.util.Scanner;
public class brown_p2 {

	public static void main(String[] args) {
		//BMI CALCULATOR
		
		System.out.println("Welcome to the BMI Calculator. First we will need your Weight and Height.");
		System.out.println("Please choose what unit of measurement you would like to use.");
		System.out.println("1.) Pounds/Inches");
		System.out.println("2.) Kilograms/Meters");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("What is your weight in Pounds?");
			float pounds = scanner.nextFloat();
			System.out.println("What is your height in Inches?");
			float inches = scanner.nextFloat();
			
			float BMI = (703*pounds)/(inches*inches);
			
			System.out.println("Your BMI is:" + (BMI));
			
			break;
			
		case 2:
			System.out.println("What is your weight in kilograms?");
			float kilograms = scanner.nextFloat();
			System.out.println("What is your height in meters?");
			float centimeters = scanner.nextFloat();
		
			float BMI2 = (kilograms)/(centimeters*centimeters);
		
			System.out.println("Your BMI is:" + (BMI2));
			
			break;
			
		}
		// TODO Auto-generated method stub

	}

}
