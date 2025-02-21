class Demo7 extends Demo6
{
	int a =20;
	void display()
	{
		System.out.println("display method of Demo7");
		System.out.println("a = "+a);
	}
	Demo7()
	{
		System.out.println("Default const of Demo7");
	}
	Demo7(int a)
	{
		super(10);	
		System.out.println("user defined const of Demo7 called");
	}
}
