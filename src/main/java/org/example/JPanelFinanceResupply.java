package org.example;

import java.awt.*;

public class JPanelFinanceResupply extends JPanelFinance {
    public JPanelFinanceResupply() {
        super(new VerticalLayout(), "Пополнение карты");
        this.add(getLabel("№ карты"));
        this.add(getTextField("Card"));
        this.add(getLabel("Сумма"));
        this.add(getTextField("Sum"));
        this.add(getButton("Зачислить на карту"));
    }
}
