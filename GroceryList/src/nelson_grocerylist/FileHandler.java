package nelson_grocerylist;

import java.io.*;

/*
 * reads and writes to the text file containing the grocery list
 * @author david
 */
public class FileHandler extends GroceryList {

    String fileName = "groceries.txt";
    String line = null;

    void writeToFile(GroceryList groceryList) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileName));) {
            out.writeObject(groceryList);
        }
    }

    void readFromFile() throws IOException {
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            try ( // wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                // close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" + fileName + "'");
        }
    }
}
