/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author david
 */
public class TotalView extends JPanel {

    private final JButton summuary_button;
    private final JTextField total_field;

    public TotalView() {
        setLayout(new FlowLayout());
        add(new JLabel("Total Due"));
        total_field = new JTextField(50);
        summuary_button = new JButton("Order Summary");
        add(total_field);
        add(summuary_button);
    }

    void total_summary_action_listener(ActionListener button_action) {
        summuary_button.addActionListener(button_action);
    }

    void set_total_feild(String total_cost) {
        total_field.setText(total_cost);
    }
}
