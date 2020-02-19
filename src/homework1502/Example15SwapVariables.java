package homework1502;

import java.util.Scanner;

public class Example15SwapVariables {
    public static void main(String[] args) {
        int i, j, k;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Value for x ::");
        i=s1.nextInt();
        System.out.println("Enter Value for y ::");
        j=s1.nextInt();
        k=i;
        i=j;
        j=k;
        System.out.println("The Value of x is :: "+i);
        System.out.println("The Value of y is :: "+j);
    }
}
