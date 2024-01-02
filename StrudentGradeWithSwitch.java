
/**using the switch statement to calculate students letter grades */

import java.util.Scanner;

public class StrudentGradeWithSwitch {
    public static void main(String[] args) {

        int grade = 0;

        System.out.print("Enter a grade here: ");
        Scanner input = new Scanner(System.in);
        grade = input.nextInt();

        switch (grade / 10) {

            case 9:
                System.out.print("Your grade is A");
                break;
            case 8:
                System.out.print("Your grade is B");
                break;
            case 7:
                System.out.print("Your grade is C");
                break;
            case 6:
                System.out.print("Your grade is D; you get luck");
                break;
            case 5:
                System.out.print("Your grade is E ; you don cast");
                break;
            default:
                System.out.print("You failed ");
        }

    }
}
