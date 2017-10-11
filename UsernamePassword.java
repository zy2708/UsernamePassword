import javax.swing.JOptionPane;

/**
 *To Authenticate a user login for Username and Password.
 *Author: Zhonglin Yang
 *E-mail Address: zy2708@email.vccs.edu
 *Last Changed: October 11, 2017
 */


public class UsernamePassword {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter Your Usename");
        if (username.equals("CSC200")) {
            String password = JOptionPane.showInputDialog("Enter Your Password");
            if (password.equals("CT0103")) {
                System.out.println("Welcome " + username + " !");
            } else {
                System.out.println("Your password is wrong!");
            }
            ;
        } else {
            System.out.println("Your username is wrong!");
        }

    }

}
