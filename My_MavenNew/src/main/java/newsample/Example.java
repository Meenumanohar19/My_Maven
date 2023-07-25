package newsample;

public class Example {

	int age; //instance variable
    int mark;   //instance variable
	
   
	public Example(int age,int mark)
	{
		this.age=age;
		this.mark=mark;	
		System.out.println(age);
		System.out.println(mark);
		this.add(3.5f,10.9d);
	}
	public void add(float f,double d)
	{
		this.sub();
		System.out.println(f+d);
	}
	public void sub()
	{
		int x=3;
		int y=5;
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj=new Example(25,50);
	}

}
