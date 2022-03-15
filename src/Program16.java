package homework;

public class Program16 {
    //main method
    public static void main(String[] args) {
        //declare input variable
        String in1 = "10";
        String in2 = "11";

        int number0 = Integer.parseInt(in1, 2);//convert variable value with base 2 into binary
        int number1 = Integer.parseInt(in2, 2);

        int addition = number0 + number1;// add 2 input

        System.out.println(Integer.toBinaryString(addition));// converts and print addition result into binary

    }

}




