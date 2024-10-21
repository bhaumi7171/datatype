package encaps;

public class Atmparent {
private int a;
int b;
int c;
public void setter(int a,int b,int c)
{
	this.a=a;
	
}
public void getter()
{
	
	
	if((a==1011)||(a==1234)||(a==1212))
	{
		System.out.println("The Atm pin is correct ");
		
	}
	
	else
		System.out.println("The Atm pin is incorrect ");
}
}
