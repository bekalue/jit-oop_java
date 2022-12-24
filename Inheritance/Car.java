public class Car extends Vehicle
{
	protected String modelName;
	public static void main(String[] args)
	{
		Car lamborgini = new Car();

		lamborgini.brand = "lamborgini";
		lamborgini.modelName = "sprus";
		
		lamborgini.honk();

		System.out.println(lamborgini.brand + " " + lamborgini.modelName);
	}
}
