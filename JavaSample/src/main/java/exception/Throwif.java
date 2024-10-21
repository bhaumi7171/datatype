package exception;

public class Throwif {
	int a;
public void display()
{

		int a=10;
		if(a>=18)
		{
		System.out.println(" a is Eligible for voting age of a is "+a);
		}
		else
		{
		//System.out.println(" a is Not Eligible for voting age of a is "+a);
		throw new ArithmeticException("|You are not eligible");
		}
}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Throwif s=new Throwif();
		s.display();
		}
	}


