package homework;

import java.util.Locale;
import java.util.Scanner;//  to implement Scanner variable

public class Program9 {

    //main method
    public static void main(String[] args) {
        String upperin; //declare variables
        String lowerin;

        Scanner upper = new Scanner(System.in);
        System.out.println("Enter String in Uppercase :                                                                              ");
        upperin = upper.nextLine();//Accepts input
        System.out.println(upperin.toLowerCase());// print to lower case

    }
}
