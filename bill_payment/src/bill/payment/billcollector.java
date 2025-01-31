package bill.payment;

public class billcollector {
	private Ipayment payment;
	public void setPayment(Ipayment payment) {
		this.payment=payment;
	}
	
	public billcollector() {
		// TODO Auto-generated constructor stub
	}
	public billcollector(Ipayment payment) {
		this.payment=payment;
	}

	public void collectPayment(double amount) {
		String pay = payment.pay(amount);
		System.out.println(pay);
	}

}
