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
public class View extends JPanel {

    int prefWidth, prefHeight;

    public View(int prefH, int prefW) {
        prefWidth = prefW;
        prefHeight = prefH;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(prefHeight, prefWidth);
    }
}
