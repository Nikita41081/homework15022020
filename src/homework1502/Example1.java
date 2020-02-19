package homework1502;

public class Example1 {
    // 2 Instance Variable Declaration
    int a = 10;
    int b = 20;

    //Instance Method Declaration
    public void addition() {
        System.out.print("Addition of a & b :: ");
        System.out.print(a + b);
    }

    //Main method declaration
    public static void main(String[] args) {
        //Object Creation for calling instance method in Main()
        Example1 obj = new Example1();
        //using Object to call method addition()
        obj.addition();
    }
}
