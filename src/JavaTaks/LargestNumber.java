package JavaTaks;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number 1:");
    int num1= scanner.nextInt();
    System.out.println("Enter the number 2:");
    int num2= scanner.nextInt();
    System.out.println("Enter the number 3:");
    int num3= scanner.nextInt();

    if(num1==num2 && num2==num3){
        System.out.println("All are equal");
    } else if (num1>=num2 && num2>=num3) {
        System.out.println("number 1 is greater");
        
    } else if (num2>=num1 && num2>=num3) {

        System.out.println("number 2 is greater");
    }
    else {
        System.out.println("all are equal");
    }
}


}
