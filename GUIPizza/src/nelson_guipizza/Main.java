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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaModel pizza_model = new PizzaModel();
        FinalView final_view = new FinalView();
        OrderSummaryView order_summary_view = new OrderSummaryView();
        MainController main_controller = new MainController(final_view, order_summary_view, pizza_model);

    }

}
