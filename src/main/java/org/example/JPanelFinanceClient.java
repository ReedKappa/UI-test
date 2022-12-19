package org.example;

public class JPanelFinanceClient extends JPanelFinance{

    public JPanelFinanceClient() {
        super(new VerticalLayout(), "Расчет с клиентом");
        this.add(getLabel("№ карты"));
        this.add(getTextField("Card"));
        this.add(getLabel("Начисления"));
        this.add(getTextField("Accruals"));
        this.add(getLabel("Баланс"));
        this.add(getTextField("Balance"));
        this.add(getLabel("К оплате"));
        this.add(getTextField("Payment"));
        this.add(getButton("Оплатить"));
    }
}
