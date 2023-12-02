import java.util.Scanner;

public class TimeConvert{

public static void main(String[] args){

int hour;
int minutes;
int seconds;
double rh;
double rm;
int userInput;
Scanner input1 = new Scanner(System.in);

System.out.print(" CONVERT SECONDS TO HRS, MINS AND SECONDS \n");
System.out.print(" Enter a number: ");
userInput = input1.nextInt();

hour = userInput / 3600 ;
rh = userInput % 3600;

minutes = (int)rh / 60;
rm = rh % 60;

seconds = (int)rm ;

System.out.printf(" %d seconds equates to %d hour %d minutes and %d seconds", userInput , hour , minutes, seconds);


}

}
