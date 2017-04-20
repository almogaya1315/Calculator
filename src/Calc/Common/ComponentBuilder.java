package Calc.Common;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by user on 19/04/2017.
 */
public class ComponentBuilder {
    private AppCommand command;
    private MouseAdapter adapter;
    private JPanel panel;
    private JTextField mainField;

    public ComponentBuilder(){
        command = new AppCommand();

        adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClickedEvent(e, panel);
            }
        };
    }

    public JComponent BuildCalcComponent(){
        FormLayout layout = new FormLayout(
                "30dlu, 2dlu, 30dlu, 2dlu, 30dlu, 2dlu, 30dlu",
                "50dlu, 30dlu, 30dlu, 30dlu, 30dlu, 30dlu"
        );

        panel = new JPanel(layout);
        panel.setBorder(Borders.DLU2_BORDER);
        CellConstraints cell = new CellConstraints();

        mainField = new JTextField();
        mainField.setEditable(false);
        mainField.setBackground(Color.LIGHT_GRAY);
        mainField.setPreferredSize(new Dimension(5, 40));
        mainField.setFont(new Font("", 1, 20));
        panel.add(mainField, cell.xyw(1, 1, 7));

        Dimension dimension = new Dimension(45, 40);

        JButton btn_C = new JButton();
        btn_C.setPreferredSize(dimension);
        btn_C.setText("C");
        panel.add(btn_C, cell.xy(1, 2));

        JButton btn_DEL = new JButton();
        btn_DEL.setPreferredSize(dimension);
        btn_DEL.setText("Del");
        panel.add(btn_DEL, cell.xy(3, 2));

        JButton btn_PM = new JButton();
        btn_PM.setPreferredSize(dimension);
        btn_PM.setText("+/-");
        panel.add(btn_PM, cell.xy(5, 2));

        JButton btn_PER = new JButton();
        btn_PER.setPreferredSize(dimension);
        btn_PER.setText("%");
        panel.add(btn_PER, cell.xy(7, 2));

        JButton btn_7 = new JButton();
        btn_7.setPreferredSize(dimension);
        btn_7.setText("7");
        panel.add(btn_7, cell.xy(1, 3));

        JButton btn_8 = new JButton();
        btn_8.setPreferredSize(dimension);
        btn_8.setText("8");
        panel.add(btn_8, cell.xy(3, 3));

        JButton btn_9 = new JButton();
        btn_9.setPreferredSize(dimension);
        btn_9.setText("9");
        panel.add(btn_9, cell.xy(5, 3));

        JButton btn_PL = new JButton();
        btn_PL.setPreferredSize(dimension);
        btn_PL.setText("+");
        panel.add(btn_PL, cell.xy(7, 3));

        JButton btn_4 = new JButton();
        btn_4.setPreferredSize(dimension);
        btn_4.setText("4");
        panel.add(btn_4, cell.xy(1, 4));

        JButton btn_5 = new JButton();
        btn_5.setPreferredSize(dimension);
        btn_5.setText("5");
        panel.add(btn_5, cell.xy(3, 4));

        JButton btn_6 = new JButton();
        btn_6.setPreferredSize(dimension);
        btn_6.setText("6");
        panel.add(btn_6, cell.xy(5, 4));

        JButton btn_MN = new JButton();
        btn_MN.setPreferredSize(dimension);
        btn_MN.setText("-");
        panel.add(btn_MN, cell.xy(7, 4));

        JButton btn_1 = new JButton();
        btn_1.setPreferredSize(dimension);
        btn_1.setText("1");
        panel.add(btn_1, cell.xy(1, 5));

        JButton btn_2 = new JButton();
        btn_2.setPreferredSize(dimension);
        btn_2.setText("2");
        panel.add(btn_2, cell.xy(3, 5));

        JButton btn_3 = new JButton();
        btn_3.setPreferredSize(dimension);
        btn_3.setText("3");
        panel.add(btn_3, cell.xy(5, 5));

        JButton btn_MP = new JButton();
        btn_MP.setPreferredSize(dimension);
        btn_MP.setText("*");
        panel.add(btn_MP, cell.xy(7, 5));

        JButton btn_0 = new JButton();
        btn_0.setPreferredSize(dimension);
        btn_0.setText("0");
        panel.add(btn_0, cell.xy(1, 6));

        JButton btn_DOT = new JButton();
        btn_DOT.setPreferredSize(dimension);
        btn_DOT.setText(".");
        panel.add(btn_DOT, cell.xy(3, 6));

        JButton btn_EQ = new JButton();
        btn_EQ.setPreferredSize(dimension);
        btn_EQ.setText("=");
        panel.add(btn_EQ, cell.xy(5, 6));

        JButton btn_DV = new JButton();
        btn_DV.setPreferredSize(dimension);
        btn_DV.setText("/");
        panel.add(btn_DV, cell.xy(7, 6));

        return panel;
    }

    public void initializeListeners(JComponent panel){
        for (Component btn : panel.getComponents()) {
            if (btn instanceof JButton) {
                btn.addMouseListener(adapter);
            }
        }
    }

    private void mouseClickedEvent(MouseEvent e, JComponent panel){
        if (e.getSource() instanceof JButton){
            JButton btn = (JButton)e.getSource();
            if (!command.setAction(mainField, btn.getText()))
                command.setDigit(mainField, btn.getText());
        }
    }
}
