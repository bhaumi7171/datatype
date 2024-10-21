package abstraction;

public class Display implements Inter,Inter2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Display d=new Display();
d.display();
d.dis();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The sum is "+c);
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println(" Hai ");
	}

}
