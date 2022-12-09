public class Hello_world
{
    String fname = "Bekalu";
    String lname = "Endrias";
    int age = 20;

    static void myMethod()
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args)
    {
        Hello_world obj = new Hello_world();
        myMethod();
        System.out.println("My name is " + obj.fname + " " + obj.lname);
        System.out.println("I am " + obj.age + " years old.");    
    }
}