package homework;

public class Program3 {

    int j= 25;// Instance variable-outside the method and inside the class
    static int k= 30;// static variable- using static keyword

    //main method
    public static void main(String[] args)
    {
     test1(); //output of test1 method
        Program3 quiz3= new Program3();
        quiz3.test5();     // 30

        }

    //instance method
    public void test5()
    {
        System.out.println("this output is generated from my instance method");
        System.out.println(j);//25
        Program3 quiz =new Program3();//create object quiz to call static variable
        System.out.println(quiz.k);//30


    }
    //static method
    public static void test1()
    {
        System.out.println("this output is generated from my static method");
        System.out.println(k);//30
        Program3 quiz1 =new Program3();//create object quiz1 to call static variable
        System.out.println(quiz1.j);//25
    }
}
