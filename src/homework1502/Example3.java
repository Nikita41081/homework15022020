package homework1502;

public class Example3 {
    //one instance and one static variable declaration
    int i = 2;
    static int j = 1;
    //Instance Method
    public void addtion() {
        System.out.println("addition of i & j ::" + (i + Example3.j));
    }
    //Static Method
    public static void subtraction() {
        //Object creation for Instance variable access
        Example3 obj = new Example3();
        System.out.println("Subtraction of i & j ::" + (obj.i - j));
    }
    //main method
    public static void main(String[] args) {
        //calling static method
        subtraction();
        //object creation for calling instance method
        Example3 obj1 = new Example3();
        obj1.addtion();
    }
}
