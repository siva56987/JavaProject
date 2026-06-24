package JavaTaks;
import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.15;
    }

    public static double calculateGrossSalary(double basicSalary, double hra, double da) {
        return basicSalary + hra + da;
    }

    public static void displayEmployeeDetails(int empId, String empName,
                                              double basicSalary, double hra,
                                              double da, double grossSalary) {

        System.out.println("\nEmployee Salary Report");
        System.out.println("----------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary, hra, da);

        displayEmployeeDetails(empId, empName, basicSalary, hra, da, grossSalary);

        scanner.close();
    }
}
