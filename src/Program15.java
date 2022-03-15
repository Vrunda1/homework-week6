package homework;

public class Program15 {

    //main method
    public static void main(String[] args) {
// declare variables
        int a = 5;
        int b = 6;
        int c = a;
        a = b;
        b = c;
        System.out.println("a= " + a);// 5 swapped no.to 6
        System.out.println("b= " + b);// 6 swapped no. to 5
    }
}