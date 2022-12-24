public class Main
{
	public static void main(String[] args)
	{
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();

		animal.sound();
		System.out.println("\n\ncat sound:");
		cat.sound();
		System.out.println("dog sound");
		dog.sound();
	}
}
