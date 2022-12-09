public class varargs
{
    public static int product(int... x)
    {
        //this method return the product of passed arguments.
        int product = 1;

        for (int i: x)
        {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args)
    {
        int x;
        x = product(3, 4);
        System.out.println(x); //output:- 12
    }
}
