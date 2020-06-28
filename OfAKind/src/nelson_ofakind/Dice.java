/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_ofakind;

/**
 *
 * @author david
 */
public class Dice {

    private int number, id;
     
    /** Creates a new instance of Dice */
    public Dice(int id) {
        number = (int)(Math.random()*6) + 1;
        this.id = id;
    }
     
     
    public void roll () {
        number = (int)(Math.random()*6) + 1; 
    }
     
    public int getCurrentNumber () {
        return number;
    }
     
    public int getId () {
        return id;
    }
}