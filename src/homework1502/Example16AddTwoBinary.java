package homework1502;

import java.util.Scanner;

public class Example16AddTwoBinary {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        //Accepting two binary string values from user
        System.out.println("Enter 1st Binary No.: ");
        String i= s1.next();
        System.out.println("Enter 2nd Binary No.: ");
        String j= s1.next();
        //Converting 2 binary string into 2 Integer values
        int n1 = Integer.parseInt(i,2);
        int n2 = Integer.parseInt(j, 2);
        int n3 = n1 + n2;
        //Converting integers to binary values
        System.out.println(("n1 :: "+Integer.toBinaryString(n1)));
        System.out.println(("n2 :: "+Integer.toBinaryString(n2)));
        System.out.println(("n3 = n1 + n2 :: "+Integer.toBinaryString(n3)));
    }
}
