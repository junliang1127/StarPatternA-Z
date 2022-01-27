package HotelBill;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.text.DecimalFormat;

public class MyHotel extends Basic
{
	static final DecimalFormat df = new DecimalFormat("0.00");
	static String starline =  "****************************************\n";
	static String underLine = "__________________________________________\n";
	Scanner sc = new Scanner(System.in);
	String email, name,choice;
	int userOpt,userAmt,userTip;
	double serCh;
	char choiceFC = 'Y';
	char choiceT;
	
	ArrayList<Bill> al = new ArrayList<Bill>();
	
	String drink;
	int price,subTotal,grandTotal;
	
	@Override
	void dispMenu() 
	{
		System.out.print(starline + "                  Menu                   \n" + 
							starline + "s/no             Drink             Price\n" +
							starline + "1               Coffee                $3\n"
								+ "2                 Tea                 $2\n"
								+ "3              SoftDrink              $4\n"
								+ "4                Water                $1\n" +
							starline + starline);
	}
	
	@Override
	void getUserDetails()
	{
		System.out.print("Enter customer name : ");
		name = sc.nextLine();
		System.out.print("Enter customer email : ");
		email = sc.nextLine();
	}
	
	@Override
	void getUserInput() 
	{
		while(choiceFC == 'Y') 
		{
			System.out.print("Please select an item (1-4) : ");
			userOpt = sc.nextInt();
			System.out.print("Please the quantity for the item : ");
			userAmt = sc.nextInt();
			calculate(userOpt, userAmt);
			
			System.out.print("Do you want to order more? (Y/N) : ");
			choice = sc.next();
			choice = choice.toUpperCase();
			choiceFC = choice.charAt(0);
		}
		
		System.out.print("Do you want to tip the waiter? (Y/N) : ");
		choice = sc.next();
		choice = choice.toUpperCase();
		choiceT = choice.charAt(0);

		if(choiceT == 'Y')
		{
			System.out.print("Input the amount : ");
			userTip = sc.nextInt();
			while(userTip < 10)
			{
				System.out.print("Tip have to be mininum $10\n");
				System.out.print("Input the amount : ");
				userTip = sc.nextInt();
			}
		}
		
	}
	
	@Override
	void calculate(int userOpt, int userAmt)
	{
		switch(userOpt)
		{
		case 1: 
			drink = "Coffee      ";
			price = 3;
			subTotal = userAmt * price;
			break;
		case 2: 
			drink = "Tea         ";
			price = 2;
			subTotal = userAmt * price;
			break;
		case 3: 
			drink = "SoftDrink   ";
			price = 4;
			subTotal = userAmt * price;
			break;
		case 4: 
			drink = "Water       ";
			price = 1;
			subTotal = userAmt * price;
			break;
			
			default: System.out.println("Invalid input");
		}
		al.add(new Bill(drink, price, userAmt, subTotal));
		grandTotal += subTotal;
		serviceCharge(grandTotal);
	}
	
	@Override
	void serviceCharge(int grandTotal)
	{
		serCh = grandTotal * 0.1;
	}
	
	@Override
	void print()
	{
		System.out.print("\n\n\n\n\n");
		System.out.print(underLine);
		System.out.println("            Bill No.:" + (new Random().nextInt(99999999)) + "                ");
		System.out.println("           Customer Name:" + name + "           ");
		System.out.println(" Customer Email:" + email );
		System.out.print(underLine);
		System.out.println("ItemName    Price    Quantity     Subtotal");
		System.out.print(underLine);
		
		for(Bill b : al)
		{
			System.out.println(b);
		}
		
//		System.out.println(drink + "  " + price + "        " + userAmt +  "           " + subTotal);
		System.out.print(underLine);
		if(choiceT == 'Y')
		{
			System.out.println("Tip to Waiter                     $ " + userTip);
		}
		System.out.println("Service Charge(10%)               $ " + df.format(serCh));
		System.out.println("Grand Total(Items)                $ " + grandTotal);
		System.out.println("Payable Total                     $ " + df.format(grandTotal + serCh + userTip));
		System.out.print(underLine);
	}
}
