/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

/**
 *
 * @author david
 */
public class PizzaModel {
    //constants

    private final int SMALL_PRICE = 10;
    private final int MEDIUM_PRICE = 12;
    private final int LARGE_PRICE = 15;
    private final int DELIVERY = 2;

    //total cost
    private float total_cost;

    public void calculate_total_cost(String pizza_size, int total_toppings) {
        total_cost = 0;
        if (!"".equals(pizza_size) && pizza_size != null){
            if (pizza_size.equalsIgnoreCase("Small")) {
                total_cost += SMALL_PRICE;
            } else if (pizza_size.equalsIgnoreCase("Medium")) {
                total_cost += MEDIUM_PRICE;
            } else if (pizza_size.equalsIgnoreCase("Large")) {
                total_cost += LARGE_PRICE;
            }
            total_cost += total_toppings * 1;
        }
    }

    public float get_total_cost() {
        return total_cost;
    }

}
