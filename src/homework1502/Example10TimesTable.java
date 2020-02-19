package homework1502;

import java.util.Scanner;

public class Example10TimesTable {
        public static void main(String[] args) {
            int num;
            //receive table number from user
            Scanner s1 = new Scanner(System.in);
            System.out.println("Please enter an Integer :: ");
            num = s1.nextInt();
            System.out.println("Times Table of "+num+" is ::");
            //using for loop for 10 iterations
            for (int i = 0; i < 10; i++) {
                System.out.println(num + " * " + (i+1) + " = " + (num * (i+1)));

            }
    }
}
