package homework;

import java.util.Scanner;// import Scanner package from java to implement Scanner class in main method

public class Program6 {
    //main method
    public static void main(String[] args) {
        int rad; // declare variables
        double area;
        double pi=3.14;
        Scanner radius = new Scanner(System.in);// allows user to enter input
        System.out.println("Enter value of Radius:  ");// enter Radius value
        rad = radius.nextInt();
        area= pi*rad*rad;// formula of calculating Area of the circle
        System.out.println("Area of the circle is :  "+area);// output of entered input
    }
}
