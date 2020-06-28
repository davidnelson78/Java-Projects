/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author david
 */
public class ToppingsView extends JPanel {

    private ArrayList<JCheckBox> toppings = new ArrayList<>();

    public ToppingsView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(new JLabel("What topping(s) would you like?", JLabel.CENTER));

        toppings.add(new JCheckBox("Pepperoni"));
        toppings.add(new JCheckBox("Sausage"));
        toppings.add(new JCheckBox("Mushroom"));
        toppings.add(new JCheckBox("Onion"));
        toppings.add(new JCheckBox("Anchovies"));

        for (JCheckBox checkbox : toppings) {
            add(checkbox);
        }
    }

    int get_checked_toppings_count() {
        int temp_count = 0;
        for (JCheckBox checkbox : toppings) {
            if (checkbox.isSelected()) {
                temp_count++;
            }
        }
        return temp_count;
    }

    String get_checked_toppings() {
        String selected_toppings = "";
        for (JCheckBox checkbox : toppings) {
            if (checkbox.isSelected()) {
                selected_toppings = selected_toppings + checkbox.getText() + " ";
            }
        }
        return selected_toppings;
    }

}
