package homework;

import java.util.Scanner;// to implement Scanner variable

public class Program8 {
    //main method
    public static void main(String[] args) {

        double b;// declare variables
        double h;
        double a;
        Scanner width = new Scanner(System.in);// enable user to enter width
        System.out.println("Enter value of width for triangle:  ");// input value  for width
        b = width.nextDouble();// accepts width input
        Scanner height = new Scanner(System.in);//enable user to enter height
        System.out.println("Enter value of height for triangle:   ");//input value for height
        h = height.nextDouble();// accepts height input
        a = ((b * h) / 2);// formula to calculate Area of triangle
        System.out.println("Area of the Triangle is:   " + a);// print area


    }
}
