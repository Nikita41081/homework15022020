package homework1502;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Example13CalcAverageOf3 {
    public static void main(String[] args) {
        int i,j,k, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 1st Number :: ");
        i=s1.nextInt();
        System.out.println("Enter 1st Number :: ");
        j=s1.nextInt();
        System.out.println("Enter 1st Number :: ");
        k=s1.nextInt();
        result=((i+j+k)/3);
        System.out.println("Average of 3 Numbers :: ");
    }

}
