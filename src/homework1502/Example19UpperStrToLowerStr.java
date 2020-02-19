package homework1502;

import java.util.Scanner;

public class Example19UpperStrToLowerStr {
    public static void main(String[] args) {
        //accepting string values in i as user input
        String i, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please Enter Text in UPPER CASE here :: ");
        i=s1.nextLine();
        //using Java Inbuilt Function to convert Upper to Lower case
        result=i.toLowerCase();
        System.out.println("The conversion in Lower Case is:: " + result);
    }
}
