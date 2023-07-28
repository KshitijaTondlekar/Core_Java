public class MobileSimDriver {
	public static void main(String args[]) {
		Mobile M= new Mobile("64Mp","OPPO",25000);
		M.printMobileDetails();
		
		M.setSim1(new Sim1(8298985552L, "OPPO"));
		M.setSim2(new Sim2(8256862354L, "OPPO"));
		M.printMobileDetails();
	}

}