//Obtaining user input from a dialog

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        
        //prompt user to enter name
        String name = JOptionPane.showInputDialog("what is your name?");

        //create the message
        String message = String.format("welcome, %s , to my application", name);

        //display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
}
