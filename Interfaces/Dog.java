interface Methods
{
	public void shit();
	public void sleep();
}

class Dog extends Animal implements Methods
{
	public void sound()
	{
		System.out.println("wu wu");
	}
	public void shit()
	{
		System.out.println("dogo shits");
	}
	public void sleep()
	{
		System.out.println("dogo sleeps");
	}
}
