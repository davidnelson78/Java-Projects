/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guitipper;

import java.awt.event.*;
import java.text.*;
import java.util.Locale;
import javax.swing.*;

/**
 *
 * @author david
 */
class ButtonHandler implements ActionListener {

    private JButton noTip, normTip, genTip;
    private JTextField userTip, subTotal;
    private JLabel total, tip, blank;

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
            if (e.getSource() == noTip) {
                double sub = Double.parseDouble(subTotal.getText());
                blank.setText("Subtotal: " + formatter.format(sub));
                tip.setText("Tip: " + formatter.format(0));
                total.setText("Total: " + formatter.format(sub));

            } else if (e.getSource() == normTip) {
                double sub = Double.parseDouble(subTotal.getText());
                double tipMath = sub * .15;
                double theTotal = sub + tipMath;
                blank.setText("Subtotal: " + formatter.format(sub));
                tip.setText("Tip: " + formatter.format(tipMath));
                total.setText("Total: " + formatter.format(theTotal));
            } else if (e.getSource() == genTip) {
                double sub = Double.parseDouble(subTotal.getText());
                double tipMath = sub * .20;
                double theTotal = sub + tipMath;
                blank.setText("Subtotal: " + formatter.format(sub));
                tip.setText("Tip: " + formatter.format(tipMath));
                total.setText("Total: " + formatter.format(theTotal));
            } else if (e.getSource() == userTip) {
                double sub = Double.parseDouble(subTotal.getText());
                double inputTip = Double.parseDouble(userTip.getText()) * .01;
                double tipMath = sub * inputTip;
                double theTotal = sub + tipMath;
                blank.setText("Subtotal: " + formatter.format(sub));
                tip.setText("Tip: " + formatter.format(tipMath));
                total.setText("Total: " + formatter.format(theTotal));
            }
        } catch (NumberFormatException e1) {
            subTotal.setText("Please enter a valid number");
        }
    }
}
