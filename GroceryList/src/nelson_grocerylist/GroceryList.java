package nelson_grocerylist;

import java.util.ArrayList;

/*
 * methods for modifying the grocery list @author david
 */
public class GroceryList {

    //creates array list of grocery items
    public ArrayList<String> groceryList = new ArrayList<>();

    public GroceryList() {
        this.groceryList = new ArrayList<>();
    }

    //adds an item to the grocery list
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    //displays the contents of the grocery list
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    //removes an item from the list
    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //finds an item on the list 
    public String findGroceryItem(String searchItem) {

        int position = groceryList.indexOf(searchItem);

        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
