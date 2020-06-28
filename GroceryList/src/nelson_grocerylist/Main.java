package nelson_grocerylist;

import java.io.IOException;
import java.util.Scanner;

/*
 * starts the program with intro, displays menu and closes the program @author
 * david
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    /*
     * @param args the command line arguments @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileHandler file = new FileHandler();
        Admin adminthis = new Admin();
        adminthis.displayIntro();
        adminthis.displayInstructions();

        boolean quit = false;
        int choice;
        viewMenu();

        /*
         * Main menu switch case to the program methods
         */
        while (!quit) {
            System.out.println("\nPlease make a selection from the main menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    viewMenu();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    removeItem();
                    break;

                case 4:
                    findItem();
                    break;

                case 5:
                    file.readFromFile();
                    break;

                case 6:
                    file.writeToFile(groceryList);
                    quit = true;
                    adminthis.sayGoodbye();
                    break;
            }
        }
    }

    /*
     * Main menu list view
     */
    public static void viewMenu() {
        System.out.println("\n");
        System.out.println("\n************************* MAIN MENU *************************");
        System.out.println("0 - VIEW the MAIN MENU at any time");
        System.out.println("1 - PRINT your grocery list");
        System.out.println("2 - ADD an item to the list");
        System.out.println("3 - REMOVE an item from the list");
        System.out.println("4 - FIND an item in the list");
        System.out.println("5 - LOAD your saved list");
        System.out.println("6 - SAVE your list and CLOSE the program");
    }

    /*
     * adds item to the array list
     */
    public static void addItem() {
        System.out.print("Enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    /*
     * removes item from the array list by its index location
     */
    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();

        groceryList.removeGroceryItem(itemNo - 1);
        System.out.println("Ok, item number " + itemNo + " has been removed from the list.");
    }

    /*
     * finds an item in the array list by searching for the string
     */
    public static void findItem() {
        System.out.print("Enter the name of the item you want to find: ");
        String searchItem = scanner.nextLine();

        if (groceryList.findGroceryItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }
}
