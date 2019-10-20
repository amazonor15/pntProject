import java.util.Scanner;

public class EmpoyeeCalculatorV3 {
	
	//Variable Declaration 
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	static double netPay;
	

	
	//Module: Welcome
	public static void welcome() {
	
		System.out.println("welcome To Pay Calculator");
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void GetInput() {
Scanner Est = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name");
		nameOfEmployee = Est.nextLine();
		
		System.out.println("Enter Number of Hours");
		numberOfHourWorked = Est.nextDouble();
		
		System.out.println("Enter Pay Rate Per Hour");
		hourlyPayRate = Est.nextDouble();
	}
	
	public static void CalculateGrossPay() {
		//Process
	   	grossPay= numberOfHourWorked * hourlyPayRate;
	   	
		
	}
	
	public static void netPay() {
		
		
		if(grossPay> 0 && grossPay<=1500) {
			netPay = grossPay - 10;
		} else if (grossPay >1500 && grossPay<=3000 ) {
			netPay = grossPay -20;
		} else if (grossPay > 3000 && grossPay<=4500 ) {
			netPay = grossPay -30;
		} else if (grossPay > 4500 && grossPay<=6000 ) {
			netPay = grossPay -40;
		}  else if (grossPay > 6000 ) {
			netPay =grossPay -50;
			
		}
		else {
			netPay=0;
			System.out.println("Invalid Input");
		}
		
		
		
	}
	public static void DisplayOutPut() {
		//Display Out Put
				System.out.println("-----------------------------");
			   	System.out.println("Name of Employee is: " + nameOfEmployee);
			   	System.out.println("Total Employee hrs is : " + numberOfHourWorked);
			   	System.out.println("Employye hr rate is: " + hourlyPayRate);
			   	System.out.println("Total Gross is: " + grossPay);
			   	System.out.println("Total NetPay is: " + netPay);
				System.out.println("-----------------------------");
	}
	
	public static void Exit() {

	   	System.out.println("");
	   	System.out.println("Thanks for using Pay Calculator");
	   	
	}
	
	public static void main(String[] args) {
		
	
	welcome();
	GetInput();
	CalculateGrossPay();
	netPay();
	DisplayOutPut();
	Exit();
	

	}

}
