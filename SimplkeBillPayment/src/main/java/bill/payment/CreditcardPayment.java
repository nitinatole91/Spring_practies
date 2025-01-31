package bill.payment;

public class CreditcardPayment implements Ipayment{

	@Override
	public String pay(double amount) {
		// logic for credit card payment 
		return "payment for sucessful through creditcard ...";
	}
}
