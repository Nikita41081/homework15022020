package homework1502;
import java.util.Scanner;
public class Example6CalcAreaCircle {
    //instance method
    public void calcAreaOfCircle(double i){
        //double variable declaration
        double result;
        result = 3.14 * i *i;
        System.out.println("The Area of Circle is ::"+ result);
    }
    //main method
    public static void main(String[] args) {
        double a;
        //scanner class for user input
        Scanner s1=new Scanner(System.in);
        System.out.println("Lets Calculate Area of Circle :: ");
        System.out.println("Please enter the Radius of Circle ::");
        a=s1.nextDouble();
        //object declaration for instance method access
        Example6CalcAreaCircle obj = new Example6CalcAreaCircle();
        obj.calcAreaOfCircle(a);
    }

}








