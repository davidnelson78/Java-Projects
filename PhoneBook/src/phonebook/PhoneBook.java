/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {   // Instantiate the phone book frame window and display it.
        PhoneBookFrame pbFrame = new PhoneBookFrame();
        pbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pbFrame.setVisible(true);
    }
}  // End SimplePhoneBook class
