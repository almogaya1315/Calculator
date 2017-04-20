package Calc.Common;

import com.sun.deploy.util.StringUtils;

import javax.swing.*;

/**
 * Created by user on 19/04/2017.
 */
public class AppCommand {
    public boolean setAction(JTextField mainField, String action) {
        if (action == ".") return false;

        for (char c : action.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            else return false;
        }

        if (action == "C") {
            mainField.setText("");
        } else if (action == "Del") {
            if (mainField.getText() != "") {
                String text = mainField.getText();
                text = text.substring(0, text.length() - 1);
                mainField.setText(text);
            }
        } else if (action == "+/-") {
            String text = mainField.getText();
            if (text != "") {
                char c = '-';
                if (text.contains("-")){
                    text = text.substring(1);
                } else {
                    String current = text;
                    text = "-";
                    text += current;
                }
            }
            mainField.setText(text);
        }
        return true;
    }

    public void setDigit(JTextField mainField, String digit) {
        if (mainField.getText().length() >= 10) return;
        if (digit == ".") {
            if (mainField.getText().contains(digit) || mainField.getText().length() == 0) return;
        }
        String text = mainField.getText();
        text += digit;
        mainField.setText(text);
    }
}
