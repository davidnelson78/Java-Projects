/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_ofakind;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Main {

    static ArrayList<Dice> die = new ArrayList<Dice>();
    static Score theScore = new Score();
    static Scanner sc = new Scanner(System.in);
    static int rounds = 10;
    static int numberOfDice, theDice;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the 'of a kind' dice game\n");

        // print menu
        boolean quit = false;
        int menuItem;
        do {
            System.out.println("\n");
            System.out.println("\n************************* MAIN MENU *************************");
            System.out.println("1. View Rules");
            System.out.println("2. Start A New Game");
            System.out.println("Press 0 to Quit");
            System.out.println("\nPlease make a selection from the main menu above: ");

            menuItem = input.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("\n************************* RULES *************************");
                    System.out.println("\nThere will be five different die being rolled at the same time for each player during a turn.");
                    System.out.println("\nA round will consist of a the player and the computer rolling the die.");
                    System.out.println("\nThe winner for each round is determined based on the following hierarchy of die values:\n"
                            + "	Five of a kind\n"
                            + "	Four of a kind\n"
                            + "	Three of a kind\n"
                            + "	Two of a kind (pair)");
                    System.out.println("\nIf both players have the same type of a kind:\n"
                            + "        example: both have three of a kind), the player with the higher value wins\n"
                            + "        example: Computer has three fives, and the user has three twos, the computer wins.");
                    System.out.println("\nA game will consist of ten rounds. The player that wins the most rounds wins.");
                    break;
                case 2:
                    startGame();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.print("\nInvalid choice.");
            }
        } while (!quit);
        System.out.println("\nBye-bye!");
    }

    public static void startGame() {

        //Make Dice
        createDice();
        Integer playerRoll;
        Integer computerRoll;
        Integer playerScore = 0;
        Integer computerScore = 0;

        for (int i = 0; i < rounds; i++) {

            System.out.print("\nYou rolled: \t\t");
            System.out.print("");
            rollDice();
            diceInfo();
            playerRoll = theScore.getScore();

            System.out.print("\nThe computer rolled:    ");
            System.out.print("");
            rollDice();
            diceInfo();
            computerRoll = theScore.getScore();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (playerRoll > computerRoll) {
                System.out.println("\n\n\tYou won this round!\n");
                playerScore++;
            }
            if (playerRoll < computerRoll) {
                System.out.println("\n\n\tThe computer won this round!\n");
                computerScore++;
            } else {
                System.out.println("\n\n\tThis round was a tie!");
            }
        }

        System.out.println("\nAfter 10 rounds:\n"
                + "        You won " + playerScore + " rounds\n"
                + "        and the computer won " + computerScore + "\n");

        if (playerScore > computerScore) {
            System.out.println("\nCongratulations, You won the game!\n");
        } else {
            System.out.println("\nOh no, you lost to the computer!\n");
        }
    }

    private static void createDice() {

        Dice die1 = new Dice(1);
        die.add(die1);

        Dice die2 = new Dice(2);
        die.add(die2);

        Dice die3 = new Dice(3);
        die.add(die3);

        Dice die4 = new Dice(4);
        die.add(die4);

        Dice die5 = new Dice(5);
        die.add(die5);
    }

    //Method rolls all the dice
    private static void rollDice() {
        die.get(0).roll();
        die.get(1).roll();
        die.get(2).roll();
        die.get(3).roll();
        die.get(4).roll();
    }

    private static void diceInfo() {
        //Display Dice Values
        for (int i = 0; i < die.size(); i++) {
            System.out.print(" " + diceValues(die.get(i)));
        }
        System.out.print("  " + theScore.getHand(die));
    }

    private static int diceValues(Dice d) {
        return d.getCurrentNumber();
    }
}
