package oopsconcepts;

class Person {
	int id;
	String name, address;

	public Person(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address= address;
	}
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
}
class StudentDetails extends Person
{
	float marks;	
	public StudentDetails(int id,String name, String address, float marks)
	{
		super(id, name, address);
		this.marks=marks;
	}
	void getData()
	{
		super.display();
		System.out.println("marks"+marks);	
	}
}
public class Singleinheritance
{
	public static void main(String[] args) {
		StudentDetails obj = new StudentDetails(1, "swastika", "mumbai", 80.0f);

		obj.getData();
	}
}

