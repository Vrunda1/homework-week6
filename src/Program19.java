package homework;

import java.util.Locale;
import java.util.Scanner;

public class Program19 {

    //main method
    public static void main(String[] args) {

        String upperin; //declare variables
        String lowerin;

        Scanner upper = new Scanner(System.in);
        System.out.println("Enter String in Uppercase :");//Input=THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        upperin = upper.nextLine();//Accepts input
        System.out.println(upperin.toLowerCase());// print to lower case-the quick brown fox jumps over the lazy dog.

    }
}