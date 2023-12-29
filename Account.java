
public class Account {
    private String name;
    private double balance;

    Account(String name, double balance){  //the constructor's "parameter list" is just name;
        this.name = name;
        if(balance > 0.0){ //if the balance is valid; by default, the initial value is 0.0 as a floating-point number;
        this.balance = balance;
        }
    }  //This makes it possible to initialize an object with the constructor as in the AccountTest class

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > balance){
            System.out.print("Withdrawal amount exceeded account balance");
        }if(withdrawAmount < balance){
            balance = balance - withdrawAmount;
            System.out.printf("Your new account balance is : %f", this.balance);
        }
    }
}
