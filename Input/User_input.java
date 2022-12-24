import java.util.Scanner;


public class User_input
{
	public static String name;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		name = input.nextLine();
		System.out.println("User \"" + name + "\" has been accepted.");
	}
}	
