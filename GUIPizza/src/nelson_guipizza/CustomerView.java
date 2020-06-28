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
public class CustomerView extends JPanel {

    private final JTextField name_text_field;
    private final JTextField phone_number_field;
    private final JTextField address_field;
    private JCheckBox delivery;

    public CustomerView() {
        //setting layout
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Wecome to Java Pizza"));

        //ask for name
        add(new JLabel("Name: "));
        name_text_field = new JTextField(15);
        add(name_text_field);

        //ask for phone number
        add(new JLabel("Phone Number: "));
        phone_number_field = new JTextField(15);
        add(phone_number_field);

        //ask for address
        add(new JLabel("Address: "));
        address_field = new JTextField(15);
        add(address_field);

        add(new JLabel(" "));
        add(new JLabel(" "));

    }

    public void setDelivery(JCheckBox delivery) {
        this.delivery = delivery;
    }

    public String get_name() {
        return name_text_field.getText();
    }

    public String get_number() {
        return phone_number_field.getText();
    }

    public String get_address() {
        return address_field.getText();
    }

}
