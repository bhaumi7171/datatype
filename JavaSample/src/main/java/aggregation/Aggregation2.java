package aggregation;

public class Aggregation2 {
	Aggregation1 agg;
	String c;
	public Aggregation2(Aggregation1 agg,String c)
	{
		this.agg=agg;
		this.c=c;
	}
		public void display()
		{
			System.out.println(agg.a);
			System.out.println(agg.b);
			System.out.println(c);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 s=new Aggregation1("Kala",25);
			Aggregation2 n=new Aggregation2(s,"Alappuzha");
				n.display();
		
	}
	}


