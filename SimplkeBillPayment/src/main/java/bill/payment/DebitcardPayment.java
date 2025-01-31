package bill.payment;

public class DebitcardPayment implements Ipayment{

	@Override
	public String pay(double amount) {
		//logic for debit card payment
		return "payment sucessful through debitcard..";
	}
}
