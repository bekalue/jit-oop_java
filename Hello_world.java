public class Hello_world
{
    String fname;
    String lname;
    int age;

    public Hello_world(String str1, String str2, int num)
    {
        this.fname = str1;
        this.lname = str2;
        this.age = num;
    }

    static void myMethod()
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args)
    {
        Hello_world obj = new Hello_world("Bekalu", "Endrias", 20);
        myMethod();
        System.out.println("--------------------------");
        System.out.println("My name is " + obj.fname + " " + obj.lname);
        System.out.println("I am " + obj.age + " years old.");    
    }
}
