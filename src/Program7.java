package homework;

import java.util.Scanner;// import Scanner package from java to implement Scanner class in main method

public class Program7 {

    //main method
    public static void main(String[] args) {
        float feh, cel; //declare variables
        Scanner sc = new Scanner(System.in);// create object
        System.out.println("Enter the temperature in Fahrenheit to convert in celsius:    ");// enable user to enter input
        feh = sc.nextFloat();
        cel = ((feh - 32) * 5) / 9;// formula to convert  Fahrenheit to Celsius
        System.out.println("Temperature in celsius:  " + cel);// output of entered input
    }


}
