import java.util.Scanner;

public class Strings{

public static void main(String[] args){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
Scanner input3 = new Scanner(System.in);
String userInput3;
String userInput1;
String userInput2;

//A LOT OF METHODS LIKE charAt(), indexOf(), length(), substring(), compareTo(), equals(), are applicable on Strings
//THE compareTo() and equals()
// userInput == "yes" will always be true hence userInput.equals("yes") will check if userInput is exactly same as argument
//they are both character sensitive

//CHECKING IF USERINPUT EQUALS PARAMETER
do{
System.out.println("VALIDATE IF USER INPUT EQUALS PARAMETER");
System.out.println("Enter the word \"HELLO\" here:  ");
userInput1 = input1.nextLine();
if(userInput1.equals("HELLO")){
break;
}else{
System.out.println("OBEY SIMPLE INSTRUCTION");
System.out.print("Enter the word \"HELLO\" here:  ");
userInput1 = input1.nextLine();
}
}while(!userInput1.equals("HELLO"));
System.out.print("Good one");


//THE compareTo() COMPARES TWO WORDS TO KNOW WHICH COMES FIRST AS IT RETURNS THE DIFFERENCE BETWEEN FIRST LETTERS THAT DIFFER BTW BOTH WORDS
//THE NEXT PROGRAM COMAPARES TO USERINPUT TO KNOW WHICH COMES FIRST

//System.out.println("THIS PROGRAM COMPARES TO WORDS TO KNOW WHICH COMES FIRST
//userInput2 = input2.nextLine

}
}