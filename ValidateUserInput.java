import java.util.Scanner;


public class ValidateUserInput{

static double userInputDouble;
static int userInputInt;
static String userInputString;

public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");



if(input.hasNextInt()){
userInputInt = input.nextInt();
System.out.printf("You entered: %d and it's an int data type", userInputInt);
}else if(input.hasNextDouble()){
userInputDouble = input.nextDouble();
System.out.printf("You entered: %f and it's a double data type", userInputDouble);
}else {
userInputString = input.nextLine();
System.out.printf("You entered: \"%s\" and it's a String data type", userInputString);
}



}

}