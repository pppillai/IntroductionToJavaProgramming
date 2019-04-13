import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seconds (integer value) : ");

        int seconds = scanner.nextInt();

        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;

        System.out.println(minutes);
        System.out.println(remainingSeconds);



    }
}
