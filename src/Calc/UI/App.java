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
        JComponent panel = new App().BuildColumnSpan();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private JComponent BuildColumnSpan(){
        FormLayout layout = new FormLayout(
                "50dlu, 2dlu, 50dlu, 2dlu, 50dlu, 2dlu, 50dlu",
                "50dlu, 30dlu, 30dlu, 30dlu, 30dlu, 30dlu"
        );

        JPanel panel = new JPanel(layout);
        panel.setBorder(Borders.DLU2_BORDER);
        CellConstraints cell = new CellConstraints();

        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(5, 40));
        field.setFont(new Font("", 1, 20));
        panel.add(field, cell.xyw(1, 1, 7));

        Dimension dimension = new Dimension(45, 40);

        JButton btn_C = new JButton();
        btn_C.setPreferredSize(dimension);
        btn_C.setText("C");
        panel.add(btn_C, cell.xy(1, 2));

        JButton btn_D = new JButton();
        btn_D.setPreferredSize(dimension);
        btn_D.setText("Del");
        panel.add(btn_D, cell.xy(3, 2));

        panel.add(new JButton("+/-"), cell.xy(5, 2));
        panel.add(new JButton("%"), cell.xy(7, 2));

        JButton btn_7 = new JButton();
        btn_7.setPreferredSize(dimension);
        btn_7.setText("7");
        panel.add(btn_7, cell.xy(1, 3));
        panel.add(new JButton("8"), cell.xy(3, 3));
        panel.add(new JButton("9"), cell.xy(5, 3));
        panel.add(new JButton("+"), cell.xy(7, 3));

        panel.add(new JButton("4"), cell.xy(1, 4));
        panel.add(new JButton("5"), cell.xy(3, 4));
        panel.add(new JButton("6"), cell.xy(5, 4));
        panel.add(new JButton("-"), cell.xy(7, 4));

        panel.add(new JButton("1"), cell.xy(1, 5));
        panel.add(new JButton("2"), cell.xy(3, 5));
        panel.add(new JButton("3"), cell.xy(5, 5));
        panel.add(new JButton("*"), cell.xy(7, 5));

        panel.add(new JButton("0"), cell.xy(1, 6));
        panel.add(new JButton("."), cell.xy(3, 6));
        panel.add(new JButton("="), cell.xy(5, 6));
        panel.add(new JButton("/"), cell.xy(7, 6));

        return panel;
    }
}
