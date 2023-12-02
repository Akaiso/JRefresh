import java.util.Scanner;

public class Quadratic{

public static void main(String[] args){

int a = 0 ;
int b = 0 ;
int c = 0 ;
double x1;
double x2;
Scanner inputa= new Scanner(System.in);
Scanner inputb= new Scanner(System.in);
Scanner inputc= new Scanner(System.in);
boolean correctInput  = true;


//introduce the program the user
System.out.println("-");
System.out.println();
System.out.print("This program called, \"Quadratic\" finds the root of ax2+bx+c=0, \n");
System.out.print("using the quadratic formula: \n");
System.out.println("x=-b+_b2-4ac2a.");
System.out.print("For a trial, you'll need to input 3 numbers, \n");
System.out.print("to represent the variables a,b,c respectively. \n");
System.out.print("- Precaution(s): \"a\" musn't be equal to zero; \"a\", \"b\" and \"c\" are constants; \n");
System.out.print("no square root of negative numbers. \n");


//prompt user to enter values




do{
System.out.print("Enter first number(a) here:  ");
if(inputa.hasNextInt()){
a = inputa.nextInt();
break;
}else{
System.out.print("This is a wrong entry...\n");
System.out.print("Enter first number(a) here:  ");
inputa.next();
}
}//end of first do block;
while(!inputa.hasNextInt());


do{
System.out.print("Enter the second number(b) here:  ");
if(inputb.hasNextInt()){
b = inputb.nextInt();
}else{
System.out.print("This is a wrong entry... \n");
System.out.print("Enter the second number(b) here:  ");
inputb.next();
}
}//end of second do block;
while(!inputb.hasNextInt());


do{
System.out.print("Enter the third  number(c) here:  ");
if(inputc.hasNextInt()){
c = inputc.nextInt();
}else{
System.out.print("This is a wrong entry... \n");
System.out.print("Enter the third number(c) here:  ");
inputc.next();
}
}//end of third do block;
while(!inputc.hasNextInt());

x1 = -b + Math.pow(b,2) - 4*a*Math.pow(c,2)*a;
x2 = -b - Math.pow(b,2) - 4*a*Math.pow(c,2)*a;

System.out.printf("The roots are x = %.1f , x = %.1f", x1, x2);




correctInput = true;

}
}