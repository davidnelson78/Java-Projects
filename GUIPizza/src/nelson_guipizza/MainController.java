/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author david
 */
public class MainController {

    private FinalView final_view;
    private OrderSummaryView order_summary_view;
    private PizzaModel pizza_model;

    public MainController(FinalView final_view, OrderSummaryView order_summary_view, PizzaModel pizza_model) {
        this.final_view = final_view;
        this.pizza_model = pizza_model;
        this.order_summary_view = order_summary_view;

        this.final_view.update_total_cost(new UpdateCalculation());
        this.final_view.total_view.total_summary_action_listener(new ButtonActionListener());

    }

    class UpdateCalculation implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            try {
                pizza_model.calculate_total_cost(final_view.size_view.get_selection(), final_view.toppings_view.get_checked_toppings_count());
                final_view.total_view.set_total_feild(String.format("%.2f", pizza_model.get_total_cost()));
            } catch (Exception ex) {
                final_view.total_view.set_total_feild("Select options carefully!");
            }
        }
    }

    class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String final_summary = "";
            try {
                final_summary = "Customer name: " + final_view.customer_view.get_name()
                        + "\nPhone Number: " + final_view.customer_view.get_number() + "\nAddress: " + final_view.customer_view.get_address() + "\nSize: "
                        + final_view.size_view.get_selection() + "\nToppings: " + final_view.toppings_view.get_checked_toppings() + "\nTotal: " + String.format("%.2f", pizza_model.get_total_cost());
                order_summary_view.set_textarea(final_summary);
            } catch (Exception ex) {
                final_summary = "Please make sure all the appropriate fields are filled out!";
                order_summary_view.set_textarea(final_summary);
            }
            order_summary_view.set_visibility(true);
        }

    }

}
