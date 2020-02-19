package homework1502;

import java.util.Scanner;

public class Example7ConvertFtoC {
    //instance method
    public void calcFahrenToDegree(double i) {
        double result;
        //formula for converting F to C
        result = (i - 32) * 5 / 9;
        System.out.println("The Celsius value is ::" + result + " ֯" +"C");
    }
    //main method
    public static void main(String[] args) {
        double a;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Fahrenheit Temperatures Ranging between -60 to 120 ֯֯F");
        System.out.println("Please Fahrenheit Value here::");
        a = s1.nextDouble();
        //Object creation for calling instance method
        Example7ConvertFtoC obj = new Example7ConvertFtoC();
        obj.calcFahrenToDegree(a);
    }

}
