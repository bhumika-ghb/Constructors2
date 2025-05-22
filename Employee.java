public class Employee{
	String name;
	double salary;
	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(String name,double Salary){
		System.out.println("name:"+name);
		System.out.println("Salary:"+salary);
	}
	public void display(){
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args){
		Employee emp=new Employee("Bhumi",50000);
		emp.display();
		System.out.println("After updating the Details");
		Employee emp2=new Employee("suppi",30000);
		emp2.display();
	}

}

		