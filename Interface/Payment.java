public interface Payment {
	
	void makepayment();
	
	default void cancelTranscation() {
		System.out.println("Transcation failed");
	}

}