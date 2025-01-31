package bill.payment;

import java.lang.reflect.Field;

public class TestMain {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		/*
		 * billcollector bill=new billcollector(); // injecting creditcard obj into
		 * billcollector (setter injection) bill.setPayment(new CreditcardPayment());
		 * bill.collectPayment(10.00);
		 */
		
		CreditcardPayment ccp=new CreditcardPayment();
		
		Class<?> clz = Class.forName("bill.payment.billcollector");
		Object newInstance = clz.newInstance();
		
		billcollector bc=(billcollector)newInstance;
		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);
		
		field.set(bc, ccp);
		
		bc.collectPayment(10.0);
	}

}
