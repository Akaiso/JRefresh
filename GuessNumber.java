import java.util.Scanner;
import java.util.Random;


public class GuessNumber{
public static void main(String[] args){

Random random = new Random();
Scanner input = new Scanner(System.in);
int userInput;
int difference;
int myNumber = random.nextInt(100)+1;

System.out.print("I'm thinking of a number between 1 and 100(including both)\n");
System.out.print("Can you guess what it is?\n");
System.out.print("\n");
System.out.print("Type a number:  ");

userInput = input.nextInt();
System.out.printf(" Your guess is: %d ", userInput);

System.out.printf("The number I was thinking of is : %d\n", myNumber);

difference = myNumber - userInput; 

System.out.printf("You were off by: %d ", difference);



}

}