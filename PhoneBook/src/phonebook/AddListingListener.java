/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author david
 */
class AddListingListener implements ActionListener {

    /**
     * The SimplePhoneBook application frame
     */
    PhoneBookFrame pbf;

    public AddListingListener(PhoneBookFrame pbFrame) {
        pbf = pbFrame;
    }

    public void actionPerformed(ActionEvent aEvent) {
        AddListingDialog addDialog = new AddListingDialog(pbf);
        addDialog.setVisible(true);
    }
}  // End AddListingListener class 
