package exception;

public class Example {
	int a=10;
	int b;
	int c;
	int d;
	String l;
	
	public void add()
	{
		System.out.println(a);
	
	try
	{
		 int d[] = { 1, 2, 3, 4, 5 };
		 System.out.println(d);
	c=a/0;
	System.out.println(" the div is "+c);
	String l=null;
	System.out.println(l);
	}
catch(ArithmeticException a)
	{
	System.out.println(" exception Handled"+a);
	}
		 catch(ArrayIndexOutOfBoundsException d)
	{
		 System.out.println(" exception Handled"+d);	 
	}
	/*catch(NullPointeException x)
	{
		 System.out.println(" exception Handled"+x);
	}*/
	finally
	{
		 System.out.println(" Hai");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example s=new Example();
s.add();
//s.disp();
	}

}
