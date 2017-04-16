package Calc.UI;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by matsll on 4/13/2017.
 */
public class App extends JPanel {
    public static void main(String[] args){

        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new App());
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public App(){
        super(new BorderLayout());

        CellConstraints cc = new CellConstraints();

        DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout(""));
        builder.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        builder.appendColumn("fill:max(pref; 75px)");
        builder.appendColumn("2dlu");
        builder.appendColumn("fill:max(pref; 75px)");
        builder.appendColumn("2dlu");
        builder.appendColumn("fill:max(pref; 75px)");
        builder.appendColumn("2dlu");
        builder.appendColumn("fill:max(pref; 75px)");
        //builder.appendRow("17dlu");


        builder.append(new JTextField());
        builder.nextLine();

        builder.appendSeparator();
        builder.nextLine();

        builder.append(new JButton("7"));

        builder.append(new JButton("8"));

        builder.append(new JButton("9"));

        builder.append(new JButton("+"));
        builder.nextLine();

        builder.append(new JButton("4"));

        builder.append(new JButton("5"));

        builder.append(new JButton("6"));

        builder.append(new JButton("-"));
        builder.nextLine();

        builder.append(new JButton("1"));

        builder.append(new JButton("2"));

        builder.append(new JButton("3"));

        builder.append(new JButton("*"));
        builder.nextLine();

        builder.append(new JButton("0"));

        builder.append(new JButton("."));

        builder.append(new JButton("="));

        builder.append(new JButton("/"));
        builder.nextLine();

        add(builder.getPanel());
    }

    private JPanel panelMain;

    private JComponent BuildColumnSpan(){
        FormLayout layout = new FormLayout(
                
        );

        return null;
    }
}
