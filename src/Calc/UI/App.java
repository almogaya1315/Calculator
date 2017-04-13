package Calc.UI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by matsll on 4/13/2017.
 */
public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton btnTest;
    private JPanel panelMain;
    private JTextField textField1;
    private JTextField textField2;

    public App() {
        btnTest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (textField1.getText() != ""){
                    String text = textField1.getText();
                    textField2.setText(text);
                }
            }
        });
    }
}
