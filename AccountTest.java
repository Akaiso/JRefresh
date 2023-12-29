//import java.util.Scanner;

//The Account drive class

public class AccountTest {

    public static void main(String[] args) {

        //Account myAccount = new Account("Helen", 22000.00); //without the constructor int the Account class, this object can't be initialized like this 
        //it would have been Account myAccount = new Account();

        Account account1 = new Account("Collins Grey", 100000.00);
        Account account2 = new Account("John Wick", -20.00);

        account1.getBalance();
       account1.getName();

        System.out.printf("Your name is %s and your account balance is $%0,12.2f \n", account1.getName(), account1.getBalance() );

        account1.deposit(200.00);

        System.out.printf("account1 balance is: $%.1f \n", account1.getBalance());

        System.out.printf("Account2's account name is : %s \n", account2.getName());

        account1.withdraw(3000);

        /*From the code above, should we have multiple objects and a change has to be made to all, that means the change 
         * will be made n times. To avoid mistakes and duplicated codes, its ideal to create a method that takes in an
         * object and then displays it account name and balance.
         */
        
        //Scanner input = new Scanner(System.in);
        //String userName = input.nextLine();
        //System.out.printf("Your name is %s : ", myAccount.getName());
        //myAccount.setName(userName);
        //System.out.printf("Your name is : %s", myAccount.getName());


    }

}
