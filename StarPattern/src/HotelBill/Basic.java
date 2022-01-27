package HotelBill;

abstract class Basic 
{
	abstract void getUserDetails();
	abstract void dispMenu();
	abstract void getUserInput();
	abstract void serviceCharge(int grandTotal);
	abstract void calculate(int userOpt, int userAmt);
	abstract void print();
}
