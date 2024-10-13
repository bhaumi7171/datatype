package superkeyword;

public class Child_Super extends Parent_Super {
	
	public Child_Super()
	{
		super();
		int d=a-b;
		System.out.println(d);
		System.out.println(super.a);
		System.out.println(super.b);
		super.div();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Super s=new Child_Super();
	
	}

}
