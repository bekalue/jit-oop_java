interface First
{
	public void fname();
}
interface Last
{
	public void lname();
}
public class Demo implements First, Last
{
	public void fname()
	{
		System.out.println("Bekalu");
	}
	public void lname()
	{
		System.out.println("Endrias");
	}
}
