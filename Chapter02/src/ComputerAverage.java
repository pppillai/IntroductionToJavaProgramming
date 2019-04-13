import java.util.Scanner;

public class ComputerAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers :");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of " + firstNumber + " " + secondNumber +
        " " + thirdNumber + " is " + average);

        int i, j, k;
        i = j = k = 2;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
