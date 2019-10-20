package ConstructorDemo;

public class Shahid {

	String strShahid;
	int intId;
	
	public Shahid(String name) {
		
		strShahid = name;
		System.out.println(strShahid);
	}
	
public Shahid(String name,int id) {
		
		strShahid = name;
		intId = id;
		
		System.out.println(strShahid + " " + intId);
	}

}
