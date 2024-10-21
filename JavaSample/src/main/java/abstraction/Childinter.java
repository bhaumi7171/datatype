package abstraction;

public class Childinter implements Inter2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childinter s=new Childinter();
s.display();
s.dis();
Inter g=new Childinter();// interface obj creation
g.display();

	}

	@Override
	public void display() {
				int c=a+b;
		System.out.println(" The sum is "+c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dis() {
		int d=a-b;
		System.out.println("The sub is "+d);
		// TODO Auto-generated method stub
		
	}

}
