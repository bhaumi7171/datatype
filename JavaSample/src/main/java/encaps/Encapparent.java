package encaps;

public class Encapparent {
	private int id;
	private String name;
	public void setter(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
public void getter()
{
	System.out.println("Name : "+name);
	System.out.println("ID : "+id);
}
}
