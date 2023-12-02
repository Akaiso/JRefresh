import java.util.Scanner;

public class Triangle{

public static void main(String[] args){

int sideA = 0;
int sideB = 0;
int sideC = 0;
int check = 5;

Scanner inputA = new Scanner(System.in);
Scanner inputB = new Scanner(System.in);
Scanner inputC = new Scanner(System.in);

System.out.println("CAN YOUR VALUES FORM A TRIANGLE ? ");
System.out.println("Enter three whole numbers as prompted: ");
System.out.println();


//validate user input and save in a variable sideA;


do{
System.out.println("Enter value for side A: &  ");
if(inputA.hasNextInt() ){
check = inputA.nextInt();
//sideA = inputA.nextInt();
if(check <= 0){
System.out.print("NO ZERO OR NEGATIVE VALUE IS ACCEPTED.\n");
}else if(check > 0){
sideA = check;
break;
}
}else{
System.out.println("Wrong entry, try again... ");
inputA.next();
}
}//end of do block;
while(check <= 0);



//validate user input and save in a variable sideB;
do{
System.out.println("Enter value for side B:   ");
if(inputB.hasNextInt() ){
check = inputB.nextInt();
//sideB = inputB.nextInt();
if(check <= 0){
System.out.print("NO ZERO OR NEGATIVE VALUE IS ACCEPTED.\n");
}else if(check > 0){
sideB = check;
break;
}
}else{
System.out.println("Wrong entry, try again... ");
inputB.next();
}
}//end of do block;
while(check <= 0);



//validate user input and save in a variable sideC;
do{
System.out.println("Enter value for side C: &  ");
if(inputC.hasNextInt() ){
check = inputC.nextInt();
//sideC = inputC.nextInt();
if(check <= 0){
System.out.print("NO ZERO OR NEGATIVE VALUE IS ACCEPTED.\n");
}else if(check > 0){
sideC = check;
break;
}
}else{
System.out.println("Wrong entry, try again... ");
inputC.next();
}
}//end of do block;
while(check <= 0);

if (sideA <= 0 || sideB <= 0 || sideC <= 0){
System.out.print("Negative values and zero are not accepted");
}

if( (sideA + sideB) < sideC || (sideB + sideC) < sideA || (sideC + sideA) < sideB){
System.out.println("Oopsy! your values can't form a triangle");
}else{System.out.println("Hurray! your values can form a triangle");
}




System.out.print("This is the end of the line");




}

}