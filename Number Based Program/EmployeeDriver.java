public class EmployeeDriver {

	public static void main(String[] args) {
		Employee E1 = new Employee();  //Object is created for Default Constructor
		Employee E2 = new Employee("Kshitija",1234,35000,"Developer","Ksh@gmail.com");
		
		System.out.println(E1.name);
		System.out.println(E2.name);
		System.out.println(E2.id);
		System.out.println(E2.salary);
		System.out.println(E2.designation);
		System.out.println(E2.email);
		

	}

}
