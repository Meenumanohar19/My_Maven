package newsample;


public class ThisEx {

	int x=10;
	int y=55;
	public void add()    
	{
	System.out.println(x+y);
	this.mul();
	}
	public void mul()    
	{
		this.display('A');
		System.out.println(x*y);
	}
    public void studDetails(String name,int mark)  
    {
    	System.out.println(name);
    	this.add();
    	System.out.println(mark);
    }
    
    public void display(char grade)     
    {
    	System.out.println(grade);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx obj=new ThisEx();
		obj.studDetails("Sita",45);

	}

}


