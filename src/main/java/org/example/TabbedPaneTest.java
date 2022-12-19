package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

public class TabbedPaneTest extends JFrame
{
    private List<String> tabNames = new ArrayList<>();
    private List<JPanel> panels = new ArrayList<>();
    public TabbedPaneTest()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new Font("Dialog", Font.PLAIN, 25));

        JPanelFinance financeResupply = new JPanelFinanceResupply();
        tabs.addTab("Пополнение", financeResupply);

        JPanelFinanceClient financeClient = new JPanelFinanceClient();
        tabs.addTab("Расчет", financeClient);

        getContentPane().add(tabs);

        setSize(720, 1280);
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
}