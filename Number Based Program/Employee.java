public class Employee {
String name;
int id;
double salary;
String email;
String designation;

// No argument constructor
 public Employee()
 {
	 System.out.println("No argument constructor is called..");
 } // Parameterized constructor 
 public Employee(String n,int id,double salary,String designation,String email)
 {
	this.name = n;
	this.id = id;
	this.salary = salary;
	this.designation = designation;
 }
 //{
	 //System.out.println("NSI");
 //}

}
