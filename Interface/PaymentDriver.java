public class PaymentDriver {

	public static void main(String[] args) {
		PhonePe pe=new PhonePe();
		pe.makepayment();
		pe.printTranscation();
		pe.checkBalance();
		pe.cancelTranscation();

	}

}
