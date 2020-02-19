package homework1502;

public class Example2 {
    //Static variables declaration
    static int i=10;
    static int j=20;
    //Static method declaration
    public static void subtraction(){
        System.out.println("Subtracting i from j :: "+(j-i));
    }

    //Main method declaration
    public static void main(String[] args) {
        //local variable printing
        int a=5;
        System.out.println(a);
        //static variable calling and printing
        System.out.println(i);
        System.out.println(j);

        subtraction();
    }
}
