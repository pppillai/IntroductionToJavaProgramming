import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {

        double radius;
        double area;

        //step1 : Read in the radius
        //radius = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for radius : ");
        radius = scanner.nextDouble();

        //step2 : Compute area
        area = radius * radius * 3.14159;

        //step3 : Display the result
        System.out.println("The area for the circle with radius " + radius + " is " + area);
    }
}
