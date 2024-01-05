import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the floating-point values separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x is the maximum value

        if (y > maximumValue) {
            maximumValue = y;
        }

        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;

        //NOTE: This entire body can be replaced with return Math.max(x, Math.max(y,z));
    }
}
