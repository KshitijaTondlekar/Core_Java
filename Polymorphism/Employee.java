public class Employee {
	int id;
	String name;
	String email;
	
	public Employee(int id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public String toString(){
		return id+"is id ,"+name+"is name,"+email+"is email";
		
	}

}
