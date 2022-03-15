package homework;

public class Program2 {
    static int a = 10;//Static variable
    static int b = 20;//Static variable

    //Static method
    public static void data() {
        System.out.println(a);//10
        System.out.println(b);//20
    }

    //main method
    public static void main(String[] args)
    {

        data();//calling static method
    }


}

