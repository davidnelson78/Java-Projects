/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_monstermash;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     *
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Admin open = new Admin();
        open.displayInfo();

        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Monster Mash!");
        System.out.println("In this battle simulator monsters will be pitted against each other in the arena of death");

        do {
            System.out.println("Press '1' To meet the monsters or '2' to Exit");
            choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    Controller.meetTheMonsters();
                    break;
                case 2:
                    open.sayGoodbye();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Please choose 1 or 2");
            }
        } while (choice == 1);

    }

}
