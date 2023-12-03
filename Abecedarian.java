import java.util.Scanner;

public class Abecedarian{

public static void main(String[] args){

isAbecedarian();

}

public static void isAbecedarian(){

Scanner input = new Scanner(System.in);
String userInput ;  // FYI: can initialize with an empty string which means it has an index of 0; as you loop through , you add each to the emptyh string
int index;
System.out.print("THIS PROGRAMS CONFIRMS IF A WORD IS ABECEDARIAN OR NOT\n");

do{
System.out.println("Enter a word of your choice:  ");
if(input.hasNextInt()){
System.out.println("numbers are not allowed");
input.next();
}else{
break;
}
}while(input.hasNextInt());


System.out.print("out");

userInput = input.nextLine();
index = userInput.length()-1;

for(int x = 0; x < index; x++){
if(x == 0){
}if(x > 0){
if(userInput.charAt(x) <= userInput.charAt(x-1)){
System.out.print("not abecedarian");
if(userInput.charAt(x) > userInput.charAt(x-1)){
if(x == index){
System.out.print("An abecedarian");

}
}

}
}
}

System.out.print("broken");

}

}