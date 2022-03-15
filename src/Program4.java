package homework;

public class Program4 {

    // instance variable
    String name = "Method";
    int x = 2;
    //Static variable
    static int y = 5;
    static int z = 10;

    //instance method
    public void step()
    {
        System.out.println(name);// Method-calling instance variable
        System.out.println(x);//2-calling instance variable
        Program4 test=new Program4();//calling static variable into instance method by creating object
        System.out.println(test.y);//5
        Program4 test1=new Program4();
        System.out.println(test1.z);//10-calling static variable into instance method by creating object
    }
    //static method
    public static void step2()
    {
        System.out.println(y);//5
        System.out.println(z);//10
        Program4 test2=new Program4();//calling instance variable into static method
        System.out.println(test2.name);//Method
        Program4 test3=new Program4();//calling instance variable into static method
        System.out.println(test3.x);//2

    }

    public static void main(String[] args)
    {
        step2();// calling static method
        Program4 test4=new Program4();
        test4.step();// calling instance method
    }
}
