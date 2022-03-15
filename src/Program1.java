package homework;

public class Program1
{
    int a=10;// Instance variable is declared inside the class and outside the method
    String name="Vrunda";// Instance variable

    // Instance method
    public void data()
    {
        System.out.println(a);// 10
        System.out.println(name);//Vrunda
    }

    //main method
    public static void main(String[] args)
    {
        Program1 obj=new Program1(); // to call instance variable into static so create object
        System.out.println(obj.a);//10
       System.out.println(obj.name);//Vrunda

    }

}
