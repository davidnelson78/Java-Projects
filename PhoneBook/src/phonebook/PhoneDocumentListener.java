/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author david
 */
class PhoneDocumentListener implements DocumentListener {

    /**
     * The phone number text field to which this listener applies
     */
    private JTextField txtField;
    /**
     * The number of characters that will cause focus to be transferred
     */
    private int numsAllowed;

    public PhoneDocumentListener(JTextField tf, int numsAllowed) {
        txtField = tf;
        this.numsAllowed = numsAllowed;
    }

    public void insertUpdate(DocumentEvent dEvent) {
        if (dEvent.getDocument().getLength() == numsAllowed) {
            txtField.transferFocus();
        }
    }

    /**
     * Empty implementation. Method necessary for implementation of
     * DocumentListener
     */
    public void removeUpdate(DocumentEvent dEvent) {
    }

    /**
     * Empty implementation. Method necessary for implementation of
     * DocumentListener
     */
    public void changedUpdate(DocumentEvent dEvent) {
    }
} // End PhoneDocumentListener class

