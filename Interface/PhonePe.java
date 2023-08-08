public class PhonePe extends BalanceInquiry implements Payment,Transcation {

	@Override
	public void printTranscation() {
		System.out.println("Transcation via PhonePe");
		
	}

	@Override
	public void makepayment() {
		System.out.println("Payment via PhonePe");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance check via PhonePe");
		
	}

}
