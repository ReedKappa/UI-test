package org.example;

import javax.swing.*;
import java.awt.*;

public class JPanelFinance extends JPanel {
    public JPanelFinance() {
        this.add(getTextField());
    }

    public JPanel getJPanel(){
        return this;
    }

    public JTextField getTextField(){
        JTextField textField = new JTextField(25);
        textField.setFont(new Font("Dialog", Font.PLAIN, 25));
        return textField;
    }
}
