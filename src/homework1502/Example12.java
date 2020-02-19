package homework1502;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        double i, j, k, l, result;
        Scanner s1= new Scanner(System.in);
        //Accepting 4 double values from user
        System.out.println("Please Enter i ::");
        i = s1.nextDouble();
        System.out.println("Please Enter j ::");
        j = s1.nextDouble();
        System.out.println("Please Enter k ::");
        k = s1.nextDouble();
        System.out.println("Please Enter l ::");
        l = s1.nextDouble();
        System.out.println("Test Data ::");
        System.out.println("(("+i+"*"+j+"-"+j+"*"+j+")/("+k+"-"+l+"))");
        //printing pattern
        result= ((i*j-j*j)/(k-l));
        System.out.println("Expected Output : "+result);
    }

}
