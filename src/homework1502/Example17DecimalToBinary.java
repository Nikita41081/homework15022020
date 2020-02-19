package homework1502;

import java.util.Scanner;

public class Example17DecimalToBinary {
    public static void main(String[] args) {
        //int num;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please Enter a Decimal Number::");
        int num = s1.nextInt();
        int [] rem = new int[25];
        int index = 0;
        while (num >0){
            rem[index]=num%2;
            index ++;
            num = num /2;
        }
        System.out.println("The Binary Number of "+num+" is ");

        for (int i=index-1; i>=0; i--){
            System.out.print(rem[i]);
        }
    }
}
