package Calc.UI;

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
        JComponent panel = new App().BuildPanel();
        frame.getContentPane().add(panel);
        //frame.add(new App());
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public App(){
        /*super(new BorderLayout());

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

        add(builder.getPanel());*/
    }

    private JPanel panelMain;

    private JComponent BuildPanel(){
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.putClientProperty("jgoodies.noContentBorder", true);

        tabbedPane.add("column span", BuildColumnSpan());
        return tabbedPane;
    }

    private JComponent BuildColumnSpan(){
        FormLayout layout = new FormLayout(
                "right:pref, 6dlu, 50dlu, 4dlu, default", "pref, 3dlu, pref, 3dlu, pref" //"fill:max(pref; 75px), 2dlu, fill:max(pref; 75px), 2dlu, fill:max(pref; 75px), 2dlu"
        );

        JPanel panel = new JPanel(layout);
        panel.setBorder(Borders.DIALOG_BORDER);
        CellConstraints cc = new CellConstraints();
        panel.add(new JTextField(), cc.xyw(1, 1, 7));
        panel.add(new JButton(), cc.xy(1, 2));
        panel.add(new JButton(), cc.xy(3, 2));
        panel.add(new JButton(), cc.xy(5, 2));
        panel.add(new JButton(), cc.xy(7, 2));

        panel.add(new JButton(), cc.xy(1, 3));
        panel.add(new JButton(), cc.xy(3, 3));
        panel.add(new JButton(), cc.xy(5, 3));
        panel.add(new JButton(), cc.xy(7, 3));

        panel.add(new JButton(), cc.xy(1, 4));
        panel.add(new JButton(), cc.xy(3, 4));
        panel.add(new JButton(), cc.xy(5, 4));
        panel.add(new JButton(), cc.xy(7, 4));

        panel.add(new JButton(), cc.xy(1, 5));
        panel.add(new JButton(), cc.xy(3, 5));
        panel.add(new JButton(), cc.xy(5, 5));
        panel.add(new JButton(), cc.xy(7, 5));

        return panel;
    }
}
