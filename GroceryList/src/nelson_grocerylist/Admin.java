package nelson_grocerylist;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * methods for displaying the opening, closing and instructions @author david
 */
public class Admin {

    public void displayIntro() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t                    *******************************    ");
        System.out.println("\t                    *      Your Grocery List      *    ");
        System.out.println("\t                    *******************************    ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sayGoodbye() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t                     *******************************    ");
        System.out.println("\t                     *       See You Next Time!    *    ");
        System.out.println("\t                     *******************************    ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }

    public void displayInstructions() {
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\n\tWith this app you can easily create and manage your grocery list");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
