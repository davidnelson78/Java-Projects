/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_schooldudes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Admin {

    public void displayIntro() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\t\t                     *******************************    ");
        System.out.println("\t\t\t                     *        School Dudes!        *    ");
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
        System.out.println("\t\t\t                     *       See You Next Time!    *    ");
        System.out.println("\t\t\t                     *******************************    ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }

    public void displayInstructions() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\nSchool Dudes allows a user to enter and retrieve data about different types of dudes in a school");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
