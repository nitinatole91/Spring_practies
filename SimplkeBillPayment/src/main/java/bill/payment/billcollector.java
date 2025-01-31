package bill.payment;

public class billcollector {
	private Ipayment payment;

	public void setPayment(Ipayment payment) {
		System.out.println("setpayment() :: executed..");
		this.payment = payment;
	}

	public billcollector() { // TODO Auto-generated constructor stub 
		
	}

	public billcollector(Ipayment payment) {
		System.out.println("constructor() :: executed..");
		this.payment = payment;
	}

	public void collectPayment(double amount) {
		System.out.println(payment.getClass().getName());
		String pay = payment.pay(amount);
		System.out.println(pay);
	}

}
