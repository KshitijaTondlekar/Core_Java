public class Mobile {
	private String cameras;
	private String brand;
	private long price;
	
	private Sim1 sim1;
	private Sim2 sim2;
	
	public Mobile(String cameras,String brand,long p) {
		this.cameras=cameras;
		this.brand=brand;
		this.price=p;
	}
	public void setCameras(String cameras) {
		this.cameras=cameras;
	}
	public String getCameras() {
		return cameras;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(long price) {
		this.price=price;
	}
	public long getPrice() {
		return price;
	}
	public void setSim1(Sim1 sim1) {
		this.sim1=sim1;
	}
	public Sim1 getSim1() {
		return sim1;
	}
	public void setSim2(Sim2 sim2) {
		this.sim2=sim2;
	}
	public Sim2 getSim2() {
		return sim2;
	}
	public void printMobileDetails() {
		System.out.println("=====Mobile=====");
		System.out.println(cameras);
		System.out.println(brand);
		System.out.println(price);
		if(sim1!=null) {
			sim1.printSim1Details();	
		}else {
			System.out.println("Sim1 is not Inserted");
		}
		if(sim2!=null) {
			sim2.printSim2Details();
		}else {
			System.out.println("Sim2 is not Inserted");
		}
	}
}
