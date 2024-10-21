package exception;

public class Sampleexcep {
int a;
int b;
int c;
int d;
public void add()
{
	a=10;
	b=20;
	c=a+b;
	System.out.println(" the sum is "+c);
	try
	{
	d=a/0;
	System.out.println(" the div is "+d);
	}
catch(Exception e)
	{
	System.out.println(" exception Handled"+e);
	}
	finally
	{
		System.out.println("Hello world ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sampleexcep s=new Sampleexcep();
s.add();
	}

}
