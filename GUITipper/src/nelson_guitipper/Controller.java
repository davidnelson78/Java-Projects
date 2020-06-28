/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guitipper;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author david
 */
public class Controller {

    private final JButton noTip;

    private final JButton normTip;
    private final JButton genTip;
    private final JTextField userTip;
    private final JTextField subTotal;
    private final JLabel total;
    private final JLabel tip;
    private final JLabel blank;

    public Controller() {
        JFrame theWindow = new JFrame("Tip Calculator");
        theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        View tipPanel = new View(400, 120);
        tipPanel.setLayout(new GridLayout(4, 2));
        ButtonHandler bHandler = new ButtonHandler();

        subTotal = new JTextField("Enter the amount");
        subTotal.setHorizontalAlignment(JTextField.CENTER);
        tipPanel.add(subTotal);
        noTip = new JButton("No Tip");
        noTip.addActionListener(bHandler);
        tipPanel.add(noTip);
        blank = new JLabel(" ");
        blank.setHorizontalAlignment(JLabel.CENTER);
        tipPanel.add(blank);
        normTip = new JButton("15% Tip");
        normTip.addActionListener(bHandler);
        tipPanel.add(normTip);
        tip = new JLabel(" ");
        tip.setHorizontalAlignment(JLabel.CENTER);
        tipPanel.add(tip);
        genTip = new JButton("20% Tip");
        genTip.addActionListener(bHandler);
        tipPanel.add(genTip);
        total = new JLabel(" ");
        total.setHorizontalAlignment(JLabel.CENTER);
        tipPanel.add(total);
        userTip = new JTextField("Different Amount (No %)");
        userTip.setHorizontalAlignment(JTextField.CENTER);
        userTip.addActionListener(bHandler);
        tipPanel.add(userTip);

        theWindow.add(tipPanel, BorderLayout.CENTER);
        theWindow.pack();
        theWindow.setVisible(true);

    }
}
