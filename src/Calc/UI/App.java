package Calc.UI;

import Calc.Common.ComponentBuilder;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by matsll on 4/13/2017.
 */
public class App extends JPanel {
    public static void main(String[] args){

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ComponentBuilder builder = new ComponentBuilder();
        JComponent panel = builder.BuildCalcComponent();
        builder.initializeListeners(panel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    JPanel panelMain;
}
