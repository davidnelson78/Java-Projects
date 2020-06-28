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
public class SizeView extends JPanel {

    private final ButtonGroup button_group;

    private final JRadioButton small_option;
    private final JRadioButton medium_option;
    private final JRadioButton large_option;

    public SizeView() {
        button_group = new ButtonGroup();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(new JLabel("What size pizza?", JLabel.CENTER));

        small_option = new JRadioButton("Small");
        small_option.setActionCommand("Small");

        medium_option = new JRadioButton("Medium");
        medium_option.setActionCommand("Medium");

        large_option = new JRadioButton("Large");
        large_option.setActionCommand("Large");

        button_group.add(small_option);
        button_group.add(medium_option);
        button_group.add(large_option);

        add(small_option);
        add(medium_option);
        add(large_option);
    }

    public ButtonGroup get_radio_group() {
        return button_group;
    }

    public String get_selection() {
        ButtonModel button_model = button_group.getSelection();
        String action_command = button_model.getActionCommand();
        return action_command;
    }
}
