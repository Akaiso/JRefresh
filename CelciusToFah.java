import java.util.Scanner;



public class CelciusToFah{

public static void main(String[] args){


double celcius;
double answer;
Scanner input1 = new Scanner(System.in);




System.out.print(" CONVERT FROM CELCIUS TO FAHRENHEIT\n");
System.out.print(" Simply type in a number:  ");
celcius = input1.nextDouble();

answer = celcius * 95.0 + 32.0;

System.out.printf(" %s celcius is = %.2f fahrenheit", celcius , answer);



}

}