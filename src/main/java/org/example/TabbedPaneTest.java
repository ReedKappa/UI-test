package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TabbedPaneTest extends JFrame
{
    private List<String> tabNames = new ArrayList<>();
    private List<JPanel> panels = new ArrayList<>();
    public TabbedPaneTest()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTabbedPane tabsLeft = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);

        setValues();

        for(int i = 1; i <= panels.size(); i++){
            tabsLeft.addTab(tabNames.get(i - 1), panels.get(i - 1));
            tabsLeft.setMnemonicAt(i - 1, String.valueOf(i).charAt(0));
        }
        // Подключение слушателя событий
        tabsLeft.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Получение выделенной вкладки
                JPanel panel = (JPanel)((JTabbedPane)e.getSource()).getSelectedComponent();
                // Добавление на вкладку новой метки
                panel.add(new JLabel("Haha"));
            }
        });
        // Подключение слушателя мыши
        tabsLeft.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Определяем индекс выделенной мышкой вкладки
                int idx = ((JTabbedPane)e.getSource()).indexAtLocation(e.getX(), e.getY());
                System.out.println("Выбрана вкладка " + idx);
            }
        });
        getContentPane().add(tabsLeft);
        setSize(1280, 720);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneTest();
    }

    public JPanel getNewTabbedPane(String name){
        JPanel panel = new JPanel();
        panel.add(new JLabel(name));
        return panel;
    }

    public void setValues(){
        panels.add(getNewTabbedPane("Финансы"));
        panels.add(getNewTabbedPane("Управление"));
        panels.add(getNewTabbedPane("Настройки"));

        tabNames.add("Финансы");
        tabNames.add("Управление");
        tabNames.add("Настройки");
    }
}