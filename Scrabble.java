import java.util.*;


public class Scrabble{

public static void main(String[] args){
canSpell();
}

public static void check(){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
String userInput1;
String userInput2;
boolean isPossible = false;

System.out.print("Enter a word for your tiles:  ");
//input1.nextLine();
userInput1 = input1.nextLine();
System.out.print("Enter a word to check:  ");
userInput2 = input2.nextLine();

if(userInput1.contains("userInput2.charAt(1)")){
//isPossible = true;
System.out.print("This can be formed");
}else{
System.out.print("Sorry, not possible");
//isPossible = false;
}

}


public static void canSpell(){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
String tile ;
String word;
int x;
int y;
int count = 0;


System.out.println("Enter letters for your tile: ");

//validate user input
while(input1.hasNextInt()){
System.out.println("Enter letters for your tile: ");
input1.nextLine();
}

//assign variable to input1
tile = input1.nextLine();

//further prompts
System.out.printf("Your tiles are: %s \n", tile);
System.out.println("Enter a word to check if \"can spell\": ");

//validate input2
while(input2.hasNextInt()){
System.out.println("Enter letters for your tile: ");
input2.nextLine();
}

//store input2
word = input2.nextLine();

System.out.printf("The word to check is : %s \n", word);


//parse inputs
for( x = 0; x < word.length(); x ++){
for(y = 0; y < tile.length(); y ++){
//System.out.printf("this is y: %s", y);
if(word.charAt(x) == tile.charAt(y)){
tile = tile.replace("tile.charAt(y)", "*");
//System.out.printf("%s", tile);
count ++;
//continue;
//System.out.print(count);
}

}

}//end of for loop


//confirm and print result
if (count == word.length()){
System.out.print("HURRAY! This word can be formed from your tile set");
}else{
System.out.print("OH!OH! This word can NOT be formed from your tile set");
}


}//end of canSpell()




}