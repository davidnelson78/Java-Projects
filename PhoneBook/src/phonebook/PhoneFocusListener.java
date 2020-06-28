/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
class PhoneFocusListener implements FocusListener {

    /**
     * an event generated as a result of focus being gained on this telephone
     * number field.
     */
    public void focusGained(FocusEvent fEvent) {
        JTextField tf = (JTextField) fEvent.getSource();
        tf.setText("");
    }

    /**
     * Not implemented
     */
    public void focusLost(FocusEvent fEvent) {
    }

} // End PhoneFocusListener class
