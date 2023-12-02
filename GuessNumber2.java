import java.util.Scanner;
import java.util.Random;


public class GuessNumber2{
public static void main(String[] args){

//initialize scanner and other variables
Random random = new Random();
Scanner input = new Scanner(System.in);
int userInput;
int difference;
int myNumber = random.nextInt(100)+1;
int sum = 0;
boolean confirmInput = true;


//introduce user to the game
System.out.print("I'm thinking of a number between 1 and 100(including both)\n");
System.out.print("Can you guess what it is?\n");
System.out.print("\n");



do{

//prompt user to enter a number
System.out.print("Type a number:  ");

//validating user input and process user input data
if(input.hasNextInt()){
userInput = input.nextInt();
difference = myNumber - userInput;

if(difference >= 30 ){
System.out.printf("The number is too low!\n");
System.out.printf("the difference between our numbers is %d \n", difference);
sum = sum + 1;
}

if(difference >= (-30) && difference <= 0 && difference < -30){
System.out.print("The number is too high!\n");
System.out.printf("the difference between our numbers is %d \n", difference);
sum = sum + 1;
}

if(difference < 30 && difference > -31 && difference != 0){
System.out.printf("You were off by: %d \n", difference);
System.out.printf("  The number I was thinking of is: %d\n", myNumber);
break;
}

if (difference == 0){
System.out.print("Congratulations! Your guess was right");
break;
}

if(sum == 3){
System.out.printf(" \n The number I was thinking of is: %d\n", myNumber);
}



} //the if statement that covers all dos;
else{
System.out.print("You have been disqualified for wrong input");
break;
}

}
while(sum < 3 );


confirmInput = true;
sum = 0;



}

}
