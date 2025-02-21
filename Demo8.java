class Demo8 extends Demo7
{
	int a =30;
	void display()
	{
		System.out.println("Disply  method of Demo7");
		System.out.println("a = " +a);
	}
	Demo8()
	{
		System.out.println("Default const of Demo7 called");
	}
	Demo8(int a )
	{
		super(10);
		System.out.println("user defined const of Demo7 called");
	}
}