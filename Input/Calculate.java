import java.util.Scanner;

public class Calculate
{
	public static void main(String[] args)
	{
		int x, y, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two numbers you want to calculate");
		x = input.nextInt();
		y = input.nextInt();

		result = x + y;

		System.out.println("your result: " + result);
	}
}
