package org.example;

import javax.swing.*;
import java.awt.*;

public abstract class JPanelFinance extends JPanel {
    private final int fontSize = 25;

    public JPanelFinance(LayoutManager layout, String header) {
        super(layout);
        this.add(getLabel(header, 40));
    }

    public JTextField getTextField(String name){
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        textField.setName(name);
        return textField;
    }

    public JLabel getLabel(String text){
        JLabel label = new JLabel(text);
        label.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        return label;
    }

    public JLabel getLabel(String text, int fontSize){
        JLabel label = new JLabel(text);
        label.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }

    public JButton getButton(String text){
        JButton button = new JButton(text);
        button.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        return button;
    }
}
