
public class Employee {
	int Eid;
	String Ename;
	float Esalary;
	Employee()
	{
	System.out.println("0-arg Constructor");
	}
	Employee(int Eid, String Ename, float Esalary)
	{
	this.Eid = Eid;
	this.Ename = Ename;
	this.Esalary = Esalary;
	}
	void display()
	{
	System.out.println("Employee id:"+ Eid);
	System.out.println("Employee name:"+ Ename);
	System.out.println("Employee salary:"+ Esalary);
	}
	public static void main(String[] args) {
		new Employee();
		Employee e1= new Employee(1, "Rakesh", 25000);
		e1.display();
		Employee e2= new Employee(2, "Kiran", 30000);
		e2.display();
		

	}

}
