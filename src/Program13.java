package homework;

import java.util.Scanner;

public class Program13 {
    //main method
    public static void main(String[] args) {
        int a1;
        int b1;
        int c1;
        int d1;

        //Scanner to input three numbers
        Scanner calculate=new Scanner(System.in);//Scanner allow user to input first number
        System.out.println("Enter first number: "  );//10
        a1= calculate.nextInt();
        Scanner calculate1=new Scanner(System.in);//Scanner allow user to input second number
        System.out.println("Enter Second number: "  );//10
        b1= calculate1.nextInt();
        Scanner calculate2=new Scanner(System.in);//Scanner allow user to input third number
        System.out.println("Enter Third number: "  );//10
        c1= calculate2.nextInt();
        d1=((a1+b1+c1)/3);// formula to get average
        System.out.println("The average of three nubers are: "+d1);//output=10



    }

}
