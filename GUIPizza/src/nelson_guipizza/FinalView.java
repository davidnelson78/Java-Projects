/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_guipizza;

import javax.swing.*;
import javax.swing.event.ChangeListener;

/**
 *
 * @author david
 */
public class FinalView extends JFrame {

    private final JTabbedPane tabbedPane;

    //all the other views
    protected CustomerView customer_view = new CustomerView();
    protected SizeView size_view = new SizeView();
    protected ToppingsView toppings_view = new ToppingsView();
    protected TotalView total_view = new TotalView();

    public FinalView() {
        super("Java Pizza");

        setSize(600, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        //add the rest of the panels here
        tabbedPane.add("Customer", customer_view);
        tabbedPane.add("Size", size_view);
        tabbedPane.add("Toppings", toppings_view);
        tabbedPane.add("Total Summary", total_view);

        //adding tabbedpane to the main JFrame
        add(tabbedPane);

        setVisible(true);
    }

    public void update_total_cost(ChangeListener listener) {
        tabbedPane.addChangeListener(listener);
    }

}
