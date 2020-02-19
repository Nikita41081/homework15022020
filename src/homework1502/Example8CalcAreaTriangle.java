package homework1502;

import java.util.Scanner;

public class Example8CalcAreaTriangle {
    //instance method
    public void calcAreaOfTriangle(int h, int b) {
        double result;
        //Formula for Triangle Area calculation
        result = (h * b) / 2;
        System.out.println("The Area of Triangle is ::" + result);
    }

    //main method
    public static void main(String[] args) {
        int height, base;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lets Calculate Area of Triangle :: ");
        System.out.println("Please enter the Height of Triangle ::");
        height = s1.nextInt();
        System.out.println("Please enter the Base of Triangle ::");
        base = s1.nextInt();
        //object creation for calling instance method
        Example8CalcAreaTriangle obj = new Example8CalcAreaTriangle();
        obj.calcAreaOfTriangle(height, base);
    }

}
