package Calc.UI;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by matsll on 4/13/2017.
 */
public class App extends JPanel {
    public static void main(String[] args){

        //FormLayout

        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new App());
        frame.pack();
        frame.setVisible(true);
    }

    public App(){
        super(new BorderLayout());

        DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout(""));
        builder.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        builder.appendColumn("fill:d:noGrow");

        builder.append(new JTextField());
    }

    private JPanel panelMain;
    private JTextField MainTextField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
}
