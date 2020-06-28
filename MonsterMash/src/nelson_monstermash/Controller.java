/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_monstermash;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author david
 */
public class Controller extends Monster {

    public Controller(int size, int speed, String name, String monsterType, int scareFactor) {
        super(size, speed, name, monsterType, scareFactor);
    }

    public static void meetTheMonsters() throws InterruptedException {

        Admin close = new Admin();

        int choice;
        Scanner scanner = new Scanner(System.in);

        Vampire v = new Vampire();
        Orc o = new Orc();

        do {

            System.out.println("Meet the Monsters!!");

            System.out.println("\nthe " + v.getName() + " has a Size of " + v.getSize() + ", a Speed of " + v.getSpeed() + " and a Scare Factor of " + v.getScareFactor());

            System.out.println("\nHe will be battling...");

            System.out.println("\nthe " + o.getName() + " has a Size of " + o.getSize() + ", a Speed of " + o.getSpeed() + " and a Scare Factor of " + o.getScareFactor());

            System.out.println("\n\nPress '1' Start a battle or '2' to Exit");
            choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    Controller.battle(v, o);
                    break;
                case 2:
                    close.sayGoodbye();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Please choose 1 or 2");
            }
        } while (choice == 1);

    }

    public static void battle(Monster p1, Monster p2) throws InterruptedException {

        Admin close = new Admin();

        int battles = 1;
        int dam1;
        int hp1;
        int dam2;
        int hp2;

        boolean isDead = false;

        do {
            dam1 = p1.getScareFactor();
            System.out.println("The " + p1.getName() + " Strikes for: " + p1.getScareFactor());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            hp2 = (p2.getSize() - dam1);

            if (hp2 < 1) {
                System.out.println("The " + p1.getName() + " Is victorious! ");
                isDead = true;
                battles++;
                if (battles <= 3) {
                    meetTheMonsters();
                }
                close.sayGoodbye();
                System.exit(0);

            }
            p2.setSize(hp2);
            dam2 = p2.getScareFactor();
            System.out.println("The " + p2.getName() + " Strikes for: " + p2.getScareFactor());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            hp1 = (p1.getSize() - dam2);

            if (hp1 < 1) {
                System.out.println("The " + p2.getName() + " Is victorious! ");
                isDead = true;
                battles++;
                if (battles <= 3) {
                    meetTheMonsters();
                }
                close.sayGoodbye();
                System.exit(0);

            }
            p1.setSize(hp1);
            System.out.println("-------------------------");
            System.out.println(p1.getName() + " HP " + p1.getSize() + " --- " + p2.getName() + " HP " + p2.getSize());
            System.out.println("-------------------------");
        } while (!isDead);

    }

}
