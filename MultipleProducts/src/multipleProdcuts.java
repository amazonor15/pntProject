import java.util.Scanner;

public class multipleProdcuts {

	
	static  String nameOfcustomer; 
	
    static String nameOfProducts;
    
    static double quantityOfProduct; 
    
    static double priceOfProduct; 
    
    static double tax;
    
    static double grossPay;
    
    static double  discountedPrice;
 
    static double netPay; 
	
	
	
    
    public static void welcome() {
    	
    	System.out.println ("Welcome to Forest.com");
    	
    	System.out.println ("123 Abcde Street");
    	System.out.println ("Brooklyn NY 10301");
    	System.out.println ("");
    	System.out.println ("        ***");
    	
    	
    }
    
    public static void input() {
    	
    	
    	Scanner scan1 = new Scanner (System.in);
    	
    	System.out.println (" Please Enter Your Name:");
    	
    	nameOfcustomer = scan1.nextLine();
    	
    
    	
    	System.out.println (" Please Enter 3 Products Name:");
    	String p1,p2,p3;
    	p1 = scan1.nextLine();
    	p2 = scan1.nextLine();
    	p3 = scan1.nextLine();
    	
    	nameOfProducts = p1+p2+p3;
    	
    	
    	System.out.println (" Please Enter Products Quantity:");
    	double pq1,pq2,pq3;
    	pq1 = scan1.nextDouble();
    	pq2 = scan1.nextDouble();
    	pq3 = scan1.nextDouble();
    	
    	quantityOfProduct= pq1+pq2+pq3;
    	
    	
    	System.out.println (" Enter 3 Product Prices:");
    	double pn1,pn2,pn3;
    	pn1 = scan1.nextDouble();
    	pn2 = scan1.nextDouble();
    	pn3 = scan1.nextDouble();
    	
    	
    	priceOfProduct= pn1+pn2+pn3;
    	
    	
    	
    	
    	
    }
    
    public static void grossP() {
    	
    	grossPay = quantityOfProduct * priceOfProduct;
    	
    	
    	
    }
	
 
    public static void discount() {
    	
    	 if (grossPay>0 && grossPay<= 100)
    	 { discountedPrice = grossPay - 5; }
    	 
    	 else if  (grossPay>100 && grossPay<=500)
    	 { discountedPrice = grossPay - 10; }
    	 
    	 else if  (grossPay>500 && grossPay<=1000)
    	 { discountedPrice = grossPay - 20; }
    	 
    	 else if  (grossPay>1000 && grossPay<=5000)
    	 { discountedPrice = grossPay - 30; }
    	 
    	 
    	 else 
    	 { netPay=0;
    	 System.out.println("Invlid Output" );}
   
    	
    }
    public static void tax() {
    	
    	tax = (grossPay*8.75)/100;
    	
    	
    	
    }
    
    public static void netP() {
  
    }
    public static void outPut() {
    	System.out.println("Your Name:" + nameOfcustomer);
    	System.out.println("Product Name:" + nameOfProducts);
    	System.out.println("Product Quantity:" + quantityOfProduct);
    	System.out.println("Product Price:" + priceOfProduct);
    	System.out.println("Gross Pay:" + grossPay);
    	System.out.println("Discount:" + (grossPay - discountedPrice));
    	System.out.println("Tax:" + tax);
    	System.out.println("Net Pay:" + (grossPay - (grossPay - discountedPrice) + tax));
    	
    	
    }
	
	public static void main(String[] args) {
		
		
		
		welcome();
		
		input();
		
		grossP();
		tax();
		discount();
		outPut();
		
		
		
	}

	
	
}
