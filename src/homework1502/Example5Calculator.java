package homework1502;
import java.util.Scanner;
public class Example5Calculator {
    //two Instance methods
    public void AddInst(int a,int b){
        int result;
        result = a+b;
        System.out.println("Addition of i is and ::"+result);
    }
    public void SubInst(int a,int b){
        int result;
        result = a-b;
        System.out.println("Subtraction of i & j is ::"+result);
    }
    //two Static methods
    public static void MultiStat(int a,int b){
        int result;
        result = a*b;
        System.out.println("Multiplication of i & j is ::"+result);
    }
    public static void DivStat(int a,int b){
        int result;
        result = a/b;
        System.out.println("Division of i & j is ::"+result);
    }
    // main method
    public static void main(String[] args) {
        int i, j;
        //using scanner class for user input
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter First Integer No.::i:: ");
        i=s1.nextInt();
        System.out.println("Enter Second Integer No.::j:: ");
        j=s1.nextInt();
        //object creation for calling instance method
        Example5Calculator obj= new Example5Calculator();
        obj.AddInst(i,j);
        obj.SubInst(i,j);
        //calling static method in main
        MultiStat(i,j);
        DivStat(i,j);
    }
}

