/*fig 5.9 calculates the class average of a set of numeric grades entered by the user, and
uses a switch statement to determine whether each grade is the equivalent of an A, B, C,
D or F and to increment the appropriate grade counter. The program also displays a summary of the number of students who received each grade. */

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args){

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n", 
         "Enter the integer grades in the range 0-100.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");

         //loop untill user enters the end-of-file indicator

         while(input.hasNextInt()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch(grade/10){
                case 9:
                case 10: 
                ++aCount;
                break;

                case 8:
                ++bCount;
                break;

                case 7:
                ++cCount;
                break;

                case 6:
                ++dCount;
                break;

                default:
                ++fCount;
                break; //OPTIONAL ; Exits the switch statement anyway

            }
         }

         System.out.printf("%nGrade Report:%n");

         if(gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
            "Number of students who received each grade: ",
            "A: ",aCount,
            "B: ", bCount,
            "C: ", cCount,
            "D: ", dCount,
            "F: ", fCount
            );
         }
         else
         System.out.println("No grades were entered");


    }
}
