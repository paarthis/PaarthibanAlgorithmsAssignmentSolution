package stockers;

import java.util.Scanner;
public class main {
	
		static double[] stockprice;
	 
		public static void main(String[] args) {
			
			int company; 
			
			boolean stockstatus;
			int raise=0; int down=0;
			sortandsearch S=new sortandsearch();
			
	System.out.print("Enter the no of companies");
	Scanner in=new Scanner(System.in);
	company=in.nextInt();

	
	stockprice=new double[company]; 

	
	for(int i=0;i<company;i++) {
	System.out.println("Enter current stock price of the company "+(i+1));
	stockprice[i]=in.nextDouble();
	System.out.println("Whether company's stock price rose today compare to yesterday?");
	stockstatus=in.nextBoolean();

	if(stockstatus==true) 
	{
		raise++;
	}

	else
	down++;
	}

	while(true) {
		System.out.println("-----------------------------------------------\n"
				+ "Enter the operation that you want to perform\n"
				+ "1. Display the companies stock prices in ascending order\n"
				+ "2. Display the companies stock prices in descending order\n"
				+ "3. Display the total no of companies for which stock prices rose today\n"
				+ "4. Display the total no of companies for which stock prices declined today\n"
				+ "5. Search a specific stock price\n"
				+ "0. press 0 to exit\n"
				+ "-----------------------------------------------");

	int value;
	value=in.nextInt();

	if(value==1) 
	{
		System.out.println("companies stock prices in ascending order are");
			S.rising(stockprice);
	}

	else if(value ==2) 
	{
		System.out.println("companies stock prices in Descending order are");
		S.falling(stockprice);
	}
	else if(value==3) 
	{
		System.out.println("Total no of companies whose stock price rose today "+ raise);
	}
	else if(value==4) 
	{
		System.out.println("Total no of companies whose stock price Declined today "+ down);
	}
	else if(value==5) 
	{
		System.out.println(" enter the key value");
		double key= in.nextDouble();
		S.searchstock(stockprice,0,stockprice.length-1, key);
	}
	else if(value==0) 
	{
		System.out.println("Exited Successfully ");
		break;
	}
	else 
	{
	System.out.println("Wrong Choice");
	}
			}
	in.close();
		}
		
	}




