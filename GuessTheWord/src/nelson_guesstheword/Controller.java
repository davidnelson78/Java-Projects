/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guesstheword;

/**
 *
 * @author david
 */
public class Controller {

    public void menu() {
        UI start = new UI();
        start.mainMenu();
    }

    public void game() {
        Game go = new Game();
        go.start();
    }
}
