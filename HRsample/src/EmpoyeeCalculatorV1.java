import java.util.Scanner;

public class EmpoyeeCalculatorV1 {

	public static void main(String[] args) {
		
	
		//Variable Declaration 
		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;
		
		System.out.println("welcome To Pay Calculator");
		System.out.println("");
		System.out.println("");

		
		
		Scanner Est = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name");
		nameOfEmployee = Est.nextLine();
		
		System.out.println("Enter Number of Hours");
		numberOfHourWorked = Est.nextDouble();
		
		System.out.println("Enter Pay Rate Per Hour");
		hourlyPayRate = Est.nextDouble();
		
		
		
		//Initialization 
		//nameOfEmployee= "Mr C";
	    //numberOfHourWorked = 40;
	   	//hourlyPayRate = 10;

	   	//Process
	   	grossPay= numberOfHourWorked * hourlyPayRate;
	   	
	   	
	   	//Display Out Put
		System.out.println("-----------------------------");
	   	System.out.println("Name of Employee is: " + nameOfEmployee);
	   	System.out.println("Total Employee hrs is : " + numberOfHourWorked);
	   	System.out.println("Employye hr rate is: " + hourlyPayRate);
	   	System.out.println("-----------------------------");
	   	System.out.println("Total Gross is: " + grossPay);
	   	
	   	
	   	System.out.println("");
	   	System.out.println("Thanks for using Pay Calculator");
	   	
	 
	}

}
