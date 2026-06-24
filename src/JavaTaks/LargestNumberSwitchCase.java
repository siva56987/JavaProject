package JavaTaks;
import java.util.Scanner;
public class LargestNumberSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int num1 = scanner.nextInt();

        System.out.println("Enter Number 2:");
        int num2 = scanner.nextInt();

        System.out.println("Enter Number 3:");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
            return;
        }

        if (num1 >= num2 && num1 >= num3) {
            largest = 1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = 2;
        } else {
            largest = 3;
        }

        switch (largest) {
            case 1:
                System.out.println("Number 1 is greater");
                break;

            case 2:
                System.out.println("Number 2 is greater");
                break;

            case 3:
                System.out.println("Number 3 is greater");
                break;

            default:
                System.out.println("Invalid");
        }

        scanner.close();
    }
}
