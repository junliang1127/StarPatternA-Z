package HotelBill;

public class Bill 
{
	String drink;
	int price, userAmt, subTotal;
	
	Bill(String drink, int price, int userAmt, int subTotal)
	{
		this.drink = drink;
		this.price = price;
		this.userAmt = userAmt;
		this.subTotal = subTotal;
	}
	
	public String toString()
	{
		return drink + "  " + price + "         " + userAmt +  "            " + subTotal;
	}
}
