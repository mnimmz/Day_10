package projects;

import java.util.Scanner;

public class ChildConversionCalc extends ConversionCalcAbstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildConversionCalc input = new ChildConversionCalc();
		
		System.out.println("Conversion Calculator");
		System.out.println("   ");
		
		Scanner enter = new Scanner(System.in);
		System.out.print("Select 1 for feet to inches, or 2 for celcius to fahrenheit: ");
		int choose = enter.nextInt();
		
		if (choose == 1){
			input.feet();
		}
		
		else if (choose == 2){
			input.celcius();
		}
		
		else {
			
		}

	}
	
	public void feet() {
		Scanner calculate = new Scanner(System.in);
		System.out.println("   ");
		System.out.print("Enter feet: ");
		int feetamt = calculate.nextInt();
		System.out.println("   ");
		System.out.print("Total Inches: ");
		System.out.println(feetamt * 12);
	}
	
	public void celcius() {
		Scanner calculate = new Scanner(System.in);
		System.out.println("   ");
		System.out.print("Enter celcius: ");
		int celciusamt = calculate.nextInt();
		System.out.println("   ");
		System.out.print("Total Fahrenheit: ");
		System.out.println(celciusamt * 9 / 5 + 32);
		
	}


}
