import java.util.Scanner;

public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius ");
        double radius = scanner.nextDouble();

        System.out.println();
        System.out.println("Area = " + radius * radius * PI);

    }
}
