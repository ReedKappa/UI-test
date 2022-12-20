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
    public TabbedPaneTest()
    {
        super("МСО");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new Font("Dialog", Font.PLAIN, 25));

        InfoAboutPosts.setValues();

        JPanelFinance financeResupply = new JPanelFinanceResupply();
        tabs.addTab("Пополнение", financeResupply);

        JPanelFinanceClient financeClient = new JPanelFinanceClient();
        tabs.addTab("Расчет", financeClient);

        JPanelSettings settings = new JPanelSettings();
        tabs.addTab("Настройки", settings);

        getContentPane().add(tabs);

        setSize(820, 1280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneTest();
    }
}