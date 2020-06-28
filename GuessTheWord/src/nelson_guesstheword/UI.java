/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guesstheword;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class UI {

    Scanner input = new Scanner(System.in);

    public void mainMenu() {

        int menuItem = 0;

        System.out.println("");

        System.out.println("\nMain Menu: \n\n\t1) Start Game \n\n\t2) View Instructions  \n\n\t3) Quit ");
        menuItem = input.nextInt();

        switch (menuItem) {
            case 1:
                Controller start = new Controller();
                start.game();
                break;

            case 2:
                instructions();
                break;

            case 3:
                Admin adminthis = new Admin();
                adminthis.sayGoodbye();

                break;

            default:
                System.out.println("Sorry you did not provide a valid number.");
                break;
        }
    }

    public void instructions() {
        UI start = new UI();

        System.out.println("\nRules:\n");
        System.out.println("\n1) The computer will choose a random secret word");
        System.out.println("\n2) Your guesses will be displayed in the solution if correct and below if incorrect");
        System.out.println("\n3) You will have 7 chances to guess the secret word");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        start.mainMenu();
    }
}
