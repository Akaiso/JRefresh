import java.util.Scanner;

/**
 * This application is a mini-scale representation of the banking system
 * There are no input validation yet
 * 
 * @author Benson Akaiso
 * @date 27/12/2023
 * 
 */

public class MiniBank {

    private String name;
    private String phoneNumber;
    private static double accountBalance;
    private String emailAddress;

    public String setName(String name) {
        return this.name = name;
    }

    public String setPhoneNumber(String phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }

    public String emailAddress(String emailAddress) {
        return this.emailAddress = emailAddress;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to On-Kolos bank");
        System.out.println();
        System.out.println("Kindly note user input verification is not done.\n");
        System.out.println("If you are On-Kolos, press \"r\" to register: \n");
        System.out.print("If you have an account, press \"B\" to check your account balance or \"W\" to withdraw");
        System.out.println();
        Scanner input1 = new Scanner(System.in);
        String response = input1.nextLine().toLowerCase();

        if (response.equals("r")) {
            registration();
        }

        if (response.equals("b")) {
            balanceCheck();

        }

    }



    public static double balanceCheck() {
        System.out.printf("Your account balance is: % f ", accountBalance);
        return accountBalance;
    }

    public static void registration() {
        System.out.print("Enter your name: ");
        Scanner nameInput = new Scanner(System.in);
        String userName = nameInput.nextLine();
        System.out.print("Enter your phone number: ");
        Scanner phoneNumberInput = new Scanner(System.in);
        String userNumber = phoneNumberInput.nextLine();
        System.out.print("Enter your email address");
        Scanner emailInput = new Scanner(System.in);
        String userEmail = emailInput.nextLine();
    }

    public double withdraw() {
        System.out.print("To register, press R, to check account balance, press B, to withdraw press W");
        System.out.println("if you like finish your money na you sabi...finesse! ");
        System.out.println("How much you wan withdraw sef?");
        Scanner subtract = new Scanner(System.in);
        int amountToWithdraw = subtract.nextInt();
        this.accountBalance = this.accountBalance - amountToWithdraw;
        System.out.printf("your account balance is now %f ", accountBalance);
        return accountBalance;
    }

}
