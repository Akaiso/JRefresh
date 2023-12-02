
import java.util.Scanner;



public class InputOut{

public static void main(String[] args){

String name;
int age;
String confirmation;
Scanner first = new Scanner(System.in);
Scanner second = new Scanner(System.in);
Scanner third = new Scanner(System.in);

System.out.print("Enter your name here: ");
name = first.nextLine();
System.out.print("Enter your age here: ");
age = second.nextInt();
System.out.printf("Confirm your name is %s and your are %d years of age.", name , age);
System.out.print(" Type \"True\" if affirmative or \"NO\" if otherwise: ");
confirmation = third.nextLine();
//System.out.println(confirmation);


//How to take in user input as a boolean

if(confirmation.contains("TRUE")) {
System.out.print("Thank you for using this service");
}else{
System.out.print("RESTART PROGRAM");

}



}

break;

}