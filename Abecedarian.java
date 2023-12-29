
//REMEMBER TO MAKE THE USERINPUT AN ARGUMENT IN THE METHOD isAbecedarian

import java.util.Scanner;

public class Abecedarian {

    public static void main(String[] args) {
        isAbecedarian();
    }

    public static void isAbecedarian() {

        int index;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String userInput;
        String userInput2;
        boolean startAfresh = false;
        boolean quitProgram = false;
        System.out.print("THIS PROGRAMS CONFIRMS IF A WORD IS ABECEDARIAN OR NOT\n");

        do {
            do {
                System.out.println("Enter a word of your choice:  ");
                if (input.hasNextInt()) {
                    System.out.println("numbers are not allowed");
                    input.next();
                } else {
                    break;
                }
            } while (input.hasNextInt());

            userInput = input.nextLine();
            index = userInput.length() - 1;

            for (int x = 0; x <= index; x++) {
                // System.out.println(x);
                if (x == 0) {
                    continue;
                }
                if (x != 0) {
                    if (userInput.charAt(x) <= userInput.charAt(x - 1)) {
                        System.out.println("Oopsy! not abecedarian");
                        break;
                    }
                    if (userInput.charAt(x) > userInput.charAt(x - 1)) {
                        if (x == index) {
                            System.out.println("Hurray! its abecedarian");
                        }
                    }
                    continue;
                }
            } // end of for loop

            do {
                System.out.println("NOTE: Quiting the game is still in progress but let's try something");
                System.out.println("To quit enter \"Q\", to continue enter \"Y\" ");
                if (input2.hasNextLine()) {
                    userInput2 = input2.nextLine().toLowerCase();
                    if (userInput2.equals("y")) {
                        break;
                    } else if (userInput2.equals("q")) {
                        startAfresh = false;
                    } else if (!input2.hasNextLine()) {
                        System.out.println("Either \"Q\" or \"Y\" please: ");
                        input2.next();

                    }

                }
            } while (input2.hasNextLine());

        } while (startAfresh = true);

    }

}