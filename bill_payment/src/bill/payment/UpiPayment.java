package bill.payment;

public class UpiPayment implements Ipayment{

	@Override
	public String pay(double amount) {
		// logic for Upipayment 
		return "payment sucessful through Upi....";
	}

}
