import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                User student = new User();

                System.out.println("Welcome to the portal\nEnter your username:");
                student.userName = input.nextLine();
                System.out.println("Password:");
                student.setPassword(input.nextLine());

                System.out.println("Yayyyyy " + student.userName + ", you are good to go");
        }
}
