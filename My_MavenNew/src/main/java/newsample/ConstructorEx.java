package newsample;



public class ConstructorEx {
	String name; //instance variable
    int marks;   //instance variable
    int rollNum;
	
	public ConstructorEx(int a,String b,int c)
	{
		rollNum=a;
		name=b;
		marks=c;
			
	}
	
	public void print()
	{
		System.out.print(rollNum+"\t");
		System.out.print(name+"\t");
		System.out.print(marks+"\t");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		ConstructorEx s1=new ConstructorEx(1,"Arya",45);
		ConstructorEx s2=new ConstructorEx(2,"Aswathy",40);
		ConstructorEx s3=new ConstructorEx(3,"Athira",49);
		ConstructorEx s4=new ConstructorEx(4,"Avinash",43);
		ConstructorEx s5=new ConstructorEx(5,"Brinda",41);
	
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		s5.print();
	}
}