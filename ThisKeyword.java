class ThisKeyword
{
	int a=10;
	void display()
	{
		int a=1000;
		System.out.println(this);
		System.out.println("a="+a);
	}
	ThisKeyword ()
	{
		this(10);
		
			System.out.println("Default Const of Demo3");
	}
	ThisKeyword(int a )
	{
		System.out.println("user defined const of Demo3");
	}
}

		