public class Main
{
	public static void main(String[] args)
	{
		Nest outter = new Nest();
		Nest.Inner_Class inner = outter.new Inner_Class();

		outter.print();
		inner.print();
	}
}
