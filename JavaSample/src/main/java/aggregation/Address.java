package aggregation;

public class Address {
	Student stu;
	String c;
	public Address(Student stu,String c)
	{
		this.stu=stu;
		this.c=c;
	}
	public void addrs()
	{
		System.out.println(stu.a);
		System.out.println(stu.b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(" Bhaumi",2);
		Address u=new Address(s," Kayamkulam");
		u.addrs();

	}

}
