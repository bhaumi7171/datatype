package polymorphism;

public class Polychild extends Polyparent {
	public void add()
	{
		int a=b-h;
		super.add();
		System.out.println("The Substraction of Two Numbers "+a);
		
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Polychild u=new Polychild();
u.add();

	}

}
