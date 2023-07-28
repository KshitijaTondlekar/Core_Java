public class Sim1 {
	private long Phoneno;
	private String type;
	
	public Sim1(long phoneno,String type) {
		this.Phoneno = phoneno;
		this.type = type;
	}

	public void setPhoneno(long phoneno) {
		this.Phoneno = phoneno;
	}
	public long getPhoneno() {
		return Phoneno;
	}
	public void printSim1Details() {
		System.out.println("====Sim1 Details====");
		System.out.println("====Phoneno====");
		System.out.println("====Type====");
		System.out.println("==================");
		
		
	}

}
