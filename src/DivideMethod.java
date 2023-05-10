import java.util.Scanner;

public class DivideMethod {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        double quotient = division(firstNum, secondNum);

        System.out.println( firstNum + " / " + secondNum + " = " + quotient );
    }
    public static double division(int num1, int num2) {
        double dividing = (double) num1 / num2;
        return dividing;
    }
}
