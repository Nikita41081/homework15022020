package homework1502;

public class Example4 {
    //two static and two instance variable declaration
    int a=1;
    int b=2;
    static int i=10;
    static int j=20;
    //instance method
    public void InstanceMethod(){
        System.out.println(a);
        System.out.println(b);
        //accessing static variable using classname
        System.out.println(Example4.i);
        System.out.println(Example4.j);
    }
    //static method
    public static void StaticMethod(){
        Example4 obj= new Example4();
        System.out.println("Calling Static method :a:: "+obj.a);
        System.out.println("Calling Static method :b:: "+obj.b);
        System.out.println("Calling Instance method :i:: "+i);
        System.out.println(Example4.j);
    }
    //main method
    public static void main(String[] args) {
        //calling static method in main
        StaticMethod();
        //calling instance method using object
        Example4 obj= new Example4();
        obj.InstanceMethod();
    }
}
