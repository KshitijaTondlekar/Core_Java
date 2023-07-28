public class Sim2 {
		private long Phoneno;
		private String type;
		
		public Sim2(long phoneno,String type) {
			this.Phoneno = phoneno;
			this.type = type;
		}

		public void setPhoneno(long phoneno) {
			this.Phoneno = phoneno;
		}
		public long getPhoneno() {
			return Phoneno;
		}
		public void printSim2Details() {
			System.out.println("====Sim2 Details====");
			System.out.println("====Phoneno====");
			System.out.println("====Type====");
			System.out.println("==================");
			
			
		}

	}



