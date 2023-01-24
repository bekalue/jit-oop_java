interface Actions
{
	public void eat();
	public void sound();
	public void sleep();
	public void play();
	public void work();
	public void study();
}
interface Behaviours
{
	public void laugh();
	public void angry();
}
abstract class Species
{
	String gender;

	public Species(String gender)
	{
		this.gender = gender;
	}
}
class Person extends Species implements Actions, Behaviours
{
	String name;
	int age;

	Person(String name, String gender, int age)
	{
		super(gender);
		this.name = name;
		this.age = age;
	}
	String gender()
	{
		return super.gender;
	}
	public void eat()
	{
		System.out.println(name + " can eat");
	}
	public void sound()
	{
		System.out.println(name + " have diffrent sounds");
	}
	public void sleep()
	{
		System.out.println(name + " can sleep");
	}
	public void play()
	{
		System.out.println(name + " can play");
	}
	public void work()
	{
		System.out.println(name + " works hard");
	}
	public void study()
	{
		System.out.println(name + " studies hard.");
	}
	public void laugh()
	{
		System.out.println(name + " laughs so good");
	}
	public void angry()
	{
		System.out.println(name + " have no anger");
	}
}
class Quiz
{
	public static void main(String[] args)
	{
		Person beke = new Person("Bekalu", "Male", 20);
		System.out.println("Name: " + beke.name);
		System.out.println("Gender: " + beke.gender());
		System.out.println("Age: " + beke.age + '\n');
		beke.eat();
		beke.sound();
		beke.sleep();
		beke.play();
		beke.work();
		beke.study();
		beke.laugh();
		beke.angry();
	}
}
