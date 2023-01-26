import java.util.Scanner;

interface Movies
{
	void displayDetails();
	int getNumberofMovies();
	void displayCatagory();
}
class ActionMovies implements Movies
{
	static int i = 0;
	static int numberofactionmovies;
	double id;
	String catagory;
	String title;
	String studio;
	double rating;

	public ActionMovies(double id, String catagory, String title, double rating, String studio)
	{
		this.id = id;
		this.catagory = catagory;
		this.title = title;
		this.rating = rating;
		this.studio = studio;
		numberofactionmovies++;
	}
	public ActionMovies(String title, double rating, String studio)
	{
		this(i++, "unset", title, rating, studio);
	}
	public void displayDetails()
	{
		System.out.println("Detail info about the movie");
		System.out.println(id + " " + catagory + " " + title + " " + studio + " " + rating);
	}
	public int getNumberofMovies()
	{
		return numberofactionmovies;
	}
	public void displayCatagory()
	{
		System.out.println("Catagory: " + catagory);
	}
}
class RomanticMovies implements Movies
{
	static int numberofromance;
	double id;
	String catagory;
	String title;
	String studio;
	double rating;

	public RomanticMovies(double id, String catagory, String title, String studio, double rating)
	{
		this.id = id;
		this.catagory = catagory;
		this.title = title;
		this.studio = studio;
		this.rating = rating;
		numberofromance++;
	}
	public void displayDetails()
	{
		System.out.println("Detail info about the movie");
		System.out.println(id + " " + catagory + " " + title + " " + studio + " " + rating);
	}
	public int getNumberofMovies() {
		return numberofromance;
	}
	@Override
	public void displayCatagory() {
		
		System.out.println("Catagory: " + catagory);
	}

}
class ActionRomance extends RomanticMovies, ActionMovies {
	ActionRomance(double id, String catagory, String title, String studio, double rating) {
		super(id, catagory, title, studio, rating);
	}
	int calculateTotalMovies(int numberofaction, int numberofromance)
	{
		return (numberofaction + numberofromance);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ActionRomance movie = new ActionRomance(numberofromance, null, null, null, numberofromance);
		System.out.println("Welcome to the movie store")
		System.out.println("Enter movie Tittle:");
		movie.title = input.nextLine();
		System.out.println("Enter movie id:");
		movie.id = input.nextDouble();
		System.out.println("Enter movie catagory:");
		movie.catagory = input.nextLine();
		System.out.println("Enter movie studio")
	}
}
