public class Student {
	String name;
	String email;
	String password;
	int Contact_No;
	String id;
	
	public Student(String name)
	{
		this.name = name;
   }
	public Student(String email,int Contact_No)
	{
		this.email = email;
		this.Contact_No = Contact_No;
	}
	public Student(String password,String id)
	{
		this.password = password;
		this.id = id;
	}
}
