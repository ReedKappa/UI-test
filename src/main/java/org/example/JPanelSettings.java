package org.example;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JPanelSettings extends JPanel {
    private final int fontSize = 25;
    private ArrayList<InfoAboutServices> servicesList = new ArrayList<>();
    public JPanelSettings() {
        super(new GridBagLayout());
        setServices();

        GridBagConstraints constraints = new GridBagConstraints();
        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.25;

        constraints.insets = new Insets(3,30,3,3);
        constraints.gridy = 0;
        constraints.gridx = 0;
        this.add(getLabel("Настраеваемый пост"), constraints);
        constraints.gridx = 1;
        this.add(getLabel("Платная пауза"), constraints);
        constraints.gridx = 2;
        this.add(getLabel("Бесплатная пауза"), constraints);

        constraints.insets = new Insets(3,30,140,30);
        constraints.gridy = 1;
        constraints.gridx = 0;
        JComboBox box = new JComboBox(InfoAboutPosts.posts.toArray());
        box.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        this.add(box, constraints);
        constraints.gridx = 1;
        this.add(getTextField("5", fontSize), constraints);
        constraints.gridx = 2;
        this.add(getTextField("5:00", fontSize), constraints);

        constraints.insets = new Insets(3,30,40,30);
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(getLabel("№ реле"), constraints);
        constraints.gridx = 1;
        this.add(getLabel("Название"), constraints);
        constraints.gridx = 2;
        this.add(getLabel("Цена/мин."), constraints);

        for (int i = 0; i < servicesList.size(); i++){
            constraints.insets = new Insets(3,30,40,30);
            i = i + 3;
            constraints.ipady = 0;
            constraints.gridy = i;
            constraints.gridx = 0;
            this.add(getLabel(String.format("%d.", i - 2)), constraints);
            constraints.gridx = 1;
            this.add(getTextField(servicesList.get(i - 3).getName(), fontSize), constraints);
            constraints.gridx = 2;
            this.add(getTextField(String.format("%d", servicesList.get(i - 3).getCost()), fontSize), constraints);
            i = i - 3;
        }

        constraints.insets = new Insets(80,3,3,3);
        constraints.gridy = servicesList.size() + 3;
        constraints.gridx = 2;
        this.add(getButton("Сохранить"), constraints);
    }

    private void setServices(){
        servicesList.add(new InfoAboutServices("ВОДА", 20));
        servicesList.add(new InfoAboutServices("ПЕНА", 25));
        servicesList.add(new InfoAboutServices("Тепл. вода", 25));
        servicesList.add(new InfoAboutServices("Воздух", 5));
        servicesList.add(new InfoAboutServices("Воск", 22));
        servicesList.add(new InfoAboutServices("Пылесос", 10));
        servicesList.add(new InfoAboutServices("Вода + пена", 20));
        servicesList.add(new InfoAboutServices("Название", 20));
    }

    public JTextField getTextField(String text, int fontSize){
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        textField.setText(text);
        return textField;
    }

    public JLabel getLabel(String text){
        JLabel label = new JLabel(text);
        label.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        return label;
    }

    public JButton getButton(String text){
        JButton button = new JButton(text);
        button.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        return button;
    }
}
