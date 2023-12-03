import java.util.Scanner;


//EXERCISE 6-2 GUESS THE SQUARE ROOT OF A GIVEN NUMBER

public class GuessSqrt{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
int userInput;
double guessNumber;
double difference;
double ans1;
double ans2;
double sqrt;

System.out.println("THIS PROGRAM WILL GUESS THE SQRT OF ANY NUMBER OF YOUR CHOICE");
System.out.println("Enter a number here:  ");

while(!input.hasNextInt()){
System.out.println("wrong value; try a whole number.");
input.next();
}

userInput = input.nextInt();
guessNumber = userInput / 2;


do{
ans1 = (guessNumber + userInput/guessNumber)/2;
guessNumber = ans1;
ans2 = (guessNumber + userInput/guessNumber)/2;
//int max = max(ans1, ans2);
//int min = max(ans1, ans2);
//difference = max-min;
difference = ans1 - ans2;


}while(difference > 0.0001);

if(difference < 0.0001){
sqrt = ans2;
System.out.printf("The sqrt is approx. %.0f ", sqrt);
}else{
System.out.print("THIS IS CRAZY");
}



}

}