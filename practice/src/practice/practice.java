package practice;

import java.util.Scanner;

public class practice {

	
	static String nothingJustTest;
	//static String okay;
	//static String how are you;
	//static String love;
	//static String care;
	static double workhr;
	static double payrate;
	static double grosspay;
	
	
	public static void input() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//System.out.println("Jamie How Are You Feeling?");
		Scanner newscan= new Scanner(System.in);
		//how are you=newscan.nextLine();
		
		
		//System.out.println("Do you Love me?");
		//okay=newscan.nextLine();

		//System.out.println("Aww Thats so sweet, I love you too");
		//care=newscan.nextLine();
		//System.out.println("Do you Care about me ?");
		//love=newscan.nextLine();
		
		
		
		boolean Nextstep;
		do {
			try {
				Scanner newscan1= new Scanner(System.in);
				System.out.println("how many hrs you worked  ?");
				workhr=newscan1.nextDouble();
				if (workhr>=0 && workhr<=80) {
					Nextstep=true;
				}
				else {
					System.out.println(" Please enter 0-80!!!");
					Nextstep=false;
				} 
				
			}catch (Exception e) {
				System.out.println("Error! Enter 0-80");
				Nextstep=false;
			}
			
			
		}while (!Nextstep);
		
		
		do {
			
			try {
				Scanner newscan1= new Scanner(System.in);
				System.out.println("Pay rate per hr ?");
				payrate=newscan1.nextDouble();
				
				if (payrate>=0 && payrate<=80) {
					Nextstep=true;}
				else {
					System.out.println(" Please enter 0-80!!!");
					Nextstep=false;}
			}catch (Exception e) {
				System.out.println("Error, Enter 0-80");
				Nextstep=false;
			}
			
			
			
			
		} while (!Nextstep);
		
		
		
		
		
		
		grosspay= workhr*payrate;
		
		
		
		
		
	}
	public static void display(){
		System.out.println("========================");
		System.out.println("Total hours: " + workhr);
		System.out.println("hourly Pay: " + payrate);
		System.out.println("Gross Pay: " + grosspay);
		System.out.println("========================");
	}
	
 	public static boolean goahead() {
		
		String goahead;
		Scanner go=new Scanner(System.in);
		
		System.out.println(" Do you want to proceed ? yes or no?");
		goahead=go.nextLine();
	
		if (goahead.contentEquals("yes")){
			return true;
		}
		
		return false;
	}
	
	
	
	public static void exit () {
		
		System.out.println("");
		System.out.println("Thank you for spending part of you life with me. It was one of the greatest moments of my life! See you around");
	}
	public static void main(String[] args) {
		
		for (int i=0; i<7; i++) {
			
			System.out.println("");
			System.out.println(" Round number: " + (i+1));
			
			input();
			display();
			
			if (!goahead()){
				break;
			}
			
			
		}
		exit();
		

		

	}

}
