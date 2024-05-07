package AggregationDemo;

public class Student 
{
	String name;
	int roll;
	Address address;
	
	public Student(String name, int roll, Address address)
	{
		this.name=name;
		this.roll=roll;
		this.address = address;
	}
	void display()
	{
		System.out.println("Name:" + name);
		System.out.println("roll:" + roll);
		System.out.println("City:" + address.city);
		System.out.println("State:" + address.state);
		System.out.println("Country:" + address.country);
	}

 	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Address addr1=new Address("Ekm","Kerala", "India");
Student s1=new Student("Soumya",22,addr1);
   s1.display();
	}
}
