/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_schooldudes;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Admin adminthis = new Admin();
        adminthis.displayIntro();
        adminthis.displayInstructions();

        SchoolDudes start = new SchoolDudes();
        start.dude();
    }
}
