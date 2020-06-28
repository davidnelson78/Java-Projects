/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guesstheword;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Admin {

    public void displayInfo() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\t\t                     *******************************    ");
        System.out.println("\t\t\t                     *       Guess The Word!       *    ");
        System.out.println("\t\t\t                     *        (aka Hangman)        *    ");
        System.out.println("\t\t\t                     *******************************    ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sayGoodbye() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\t\t                     *******************************    ");
        System.out.println("\t\t\t                     *       Thanks for playing!   *    ");
        System.out.println("\t\t\t                     *           Goodbye           *    ");
        System.out.println("\t\t\t                     *******************************    ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
