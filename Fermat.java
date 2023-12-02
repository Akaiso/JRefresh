import java.util.Scanner;


public class Fermat{

public static void main(String[] args){

boolean checker = true;
int a ;
int b ;
int c ;
int n ;
Scanner inputa = new Scanner(System.in);
Scanner inputb = new Scanner(System.in);
Scanner inputc = new Scanner(System.in);
Scanner inputn = new Scanner(System.in);

//introduction to the user
System.out.print("THIS IS TO TEST THE FERMAT'S LAST THEOREM WHICH STATES: \n");
System.out.print("There are no integers a,b,c and n such that an + bn = cn except when n <= 2\n");


do{

System.out.println();
System.out.print("Enter three numbers as prompted \n");

//prompt user and validate user input
System.out.print("Enter a number for a: ");
if(!inputa.hasNextInt()){
System.out.print("This is an invalid entry");
break;
}else{
a = inputa.nextInt();}

System.out.print("Enter a number for b: ");
if(!inputb.hasNextInt()){
System.out.print("This is an invalid entry");
break;
}else{
b = inputb.nextInt();}

System.out.print("Enter a number for c: ");
if(!inputc.hasNextInt()){
System.out.print("This is an invalid entry");
break;
}else{
c = inputc.nextInt();}


System.out.print("Enter a number for n: ");
if(!inputn.hasNextInt()){
System.out.print("This is an invalid entry");
break;
}else{
n = inputn.nextInt();}

//store expressions in variables
double leftSide = Math.pow(a,n) + Math.pow(b,n);
double rightSide = Math.pow(c,n);


//compare and print result
if ( leftSide == rightSide && n>2){
System.out.print("Fermat was wrong");
checker = false;
}else{
System.out.print("No! that doesn't work");
checker = false;
}

} //end of the do block
while(checker = true);
//while(inputa.hasNextInt() || inputb.hasNextInt() || inputc.hasNextInt() || inputn.hasNextInt());


}

}