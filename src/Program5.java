package homework;

public class Program5 {

    //declare variables
    static int H = 20;
    static int H1 = 10;
    double H3 = 80;
    double  H4 = 40;

//main method
    public static void main(String[] args) {
        test1();
        test3();
       Program5 programe54=new Program5();
        programe54.test2();
       Program5 programe55=new Program5();
        programe55.test4();


    }

    //static method calling static variable
    public static void test1() {
        System.out.println("Addition of two number  " + (H + H1));

    }

    //instance method calling instance variable
    public void test2() {
        System.out.println("Subtraction  of two numbers  " + (H3 - H4));

    }

    // static method calling instance variable
    public static void test3() {
        Program5 programe5 = new Program5();
       Program5 programe51 = new Program5();

        System.out.println(" Multiplication of two numbers " + (programe5.H3 * programe51.H4));

    }
    //  instance method calling static variables
    public void test4(){
       Program5 programe52=new Program5();
       Program5 programe53=new Program5();

        System.out.println(" Division of two numbers "+ (programe52.H/programe53.H1));

    }



}

