/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

import javax.swing.*;

/**
 *
 * @author david
 */
public class OrderSummaryView extends JFrame {

    private final JTextArea summary_text;

    public OrderSummaryView() {
        super("Order Summary");
        setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //this will hold the order summary
        summary_text = new JTextArea();
        getContentPane().add(summary_text);
        setVisible(false);
    }

    public void set_textarea(String text) {
        summary_text.setText(text);
    }

    public void set_visibility(boolean visible) {
        this.setVisible(visible);
    }

}
