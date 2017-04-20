package Calc.Common;

import javax.swing.*;

/**
 * Created by user on 19/04/2017.
 */
public class AppCommand {
    private double preActionValue;
    private String currentAction;

    public AppCommand() {
        preActionValue = 0;
        currentAction = "";
    }

    public boolean setAction(JTextField mainField, String action) {
        if (action == ".") return false;

        for (char c : action.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            else return false;
        }

        if (action == "C") {
            mainField.setText("");
            resetAction();
        } else if (action == "Del") {
            if (mainField.getText() != "") {
                String text = mainField.getText();
                text = text.substring(0, text.length() - 1);
                mainField.setText(text);
                resetAction();
            }
        } else if (action == "+/-") {
            String text = mainField.getText();
            if (text != "") {
                char c = '-';
                if (text.contains("-")) {
                    text = text.substring(1);
                } else {
                    String current = text;
                    text = "-";
                    text += current;
                }
                resetAction();
            }
            mainField.setText(text);
        } else if (action == "%") {
            //todo
        } else if (action == "+" || action == "-" || action == "*" || action == "/") {
            if (mainField.getText() == "" ||
                    mainField.getText().endsWith(".")) return false;
            preActionValue = Double.parseDouble(mainField.getText());
            currentAction = action;
            mainField.setText("");
        } else if (action == "=") {
            if (preActionValue != 0 && currentAction != "") {
                double currentValue = Double.parseDouble(mainField.getText());
                double result = 0;
                switch (currentAction) {
                    case "+":
                        result = (preActionValue + currentValue);
                        break;
                    case "-":
                        result = (preActionValue - currentValue);
                        break;
                    case "*":
                        result = (preActionValue * currentValue);
                        break;
                    case "/":
                        result = (preActionValue / currentValue);
                        break;
                }
                String text = String.valueOf(result);
                mainField.setText(text);
            }
        }
        return true;
    }

    public void setDigit(JTextField mainField, String digit) {
        if (currentAction != "")
            mainField.setText("");

        if (mainField.getText().length() >= 10) return;

        if (digit == ".") {
            if (mainField.getText().contains(digit) || mainField.getText().length() == 0) return;
        }
        String text = mainField.getText();
        text += digit;
        mainField.setText(text);
    }

    private void resetAction() {
        preActionValue = 0;
        currentAction = "";
    }
}
