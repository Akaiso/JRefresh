//Using for loop and charAt to check if each letter appears exactly twice in a word
//This program takes an input
//validates the input to be sure its a string
//checks if the input has a letter appeariing twice in it (doubloon)
//Tells you if its a doubloon or not
//YOU CAN TAKE OUT THE VALIDATION TO MAKE IT WORK WITH STRING OF NUBERS
//my first push to stackoverflow Dec 5,2023 . Took me 2 days to get this.

import java.util.Scanner;

public class Doubloon{

    public static void main(String[] args){
        isDoubloon();
    }

    public static void isDoubloon(){

        Scanner input = new Scanner(System.in);
        String userInput ;
        int i;
        int x;
        boolean isNotDoolean = false;


        System.out.println("Enter a word: ");

//Validate user input
        do{
            if(input.hasNextInt()){
                System.out.println("Numbers are not allowed");
                System.out.println("Try again: ");
                input.nextLine();
                continue;
            }else if(!input.hasNextInt()){
//userInput = input.nextLine();
                break;
            }
        }while(input.hasNextInt());

//store validated input
        userInput = input.nextLine();

//parse userinput and confirm if it is a doubloon or not
        for(x = 0; x < userInput.length(); x++){
            for( i = 1; i < userInput.length(); i ++){
                if(userInput.charAt(x) == userInput.charAt(i) && x != i){
                    System.out.print("Yes! this is a doubloon");
                    return;
                }else{isNotDoolean = true;}
                if(x == userInput.length()-1 && isNotDoolean == true){
                    System.out.print("Oh no! this is not a doubloon");
                    return;
                }

            }

        } //end of for loop;


    }
}

