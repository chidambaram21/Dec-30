package edu.stpeters.fsd;

interface Money{
	
	void dollarToInr(int usDollar);
	//1 dollar==Rs.84.75
	void poundToInr(int ukPound);
	//1 pound == rs.120.65
	
}

class IndianRupee implements Money{
	

@Override
public void dollarToInr(int usDollar) {
     float res=84.75f*usDollar;
	System.out.println("Indian rupees---->+");
	
}

@Override
public void poundToInr(int ukPound) {
	float res=120.65f*ukPound;
	System.out.println("UK Pounds "+ukPound+" indian rupees--->"+res);
	
}
public class CurrencyDemo {

	public static void main(String[]args) {

		IndianRupee indianRuppes = new IndianRupee();
		
		indianRuppes.dollarToInr(100);
		indianRuppes.poundToInr(100);
		
	}
}
}
		
