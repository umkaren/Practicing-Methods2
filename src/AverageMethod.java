import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;

        double average = average(num1, num2, num3);

        System.out.println("The average is: " + average);
    }
    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
    public static double average(int num1, int num2, int num3) {
        double average = sum(num1, num2, num3) / 3.0;
        return average;
    }
}
