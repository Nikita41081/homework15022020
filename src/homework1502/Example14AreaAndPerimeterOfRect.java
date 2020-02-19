package homework1502;

import java.util.Scanner;

public class Example14AreaAndPerimeterOfRect {
    public static void main(String[] args) {
        double width, height, area, perimeter;
        System.out.println("Please enter Width of Rectangle ::");
        Scanner s1= new Scanner(System.in);
        width = s1.nextDouble();
        System.out.println("Please enter Height of Rectangle ::");
        height = s1.nextDouble();
        //Area of Rectangle
        area = width * height;
        //Perimeter of Rectangle
        perimeter = 2 * (width+height);
        System.out.println("Area of Rectangle ::"+area);
        System.out.println("Perimeter of Rectangle ::"+perimeter);
    }
}
