package org.tnsif.acc.c2tc.method_overriding_super;
class Payment
{
	void makePayment()
	{
		System.out.println("Processing Payment Using Generic Methos ");
	}
}
class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Paymnet is Done using UPI  ");
		
	}
}
class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Paymentis Done Using Credit/Debit Card ");
	}
}
class WaletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment Done Using Wallet ");
	}
}
public class PaymentTest {

	public static void main(String[] args) {
		Payment payment;
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WaletPayment();
		payment.makePayment();
		

	}

}
