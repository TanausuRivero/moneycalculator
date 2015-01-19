package Controller;

import Model.ExchangeRate;
import Model.Money;
import Process.Exchanger;
import UI.ExchangeDialog;
import UI.MoneyDisplay;

public class ExchangeOperation{
 
    private final ExchangeDialog dialog;
    private final MoneyDisplay display;
    private final ExchangeRate exchangeRate;
    private final Exchanger exchanger;
    
    public ExchangeOperation(ExchangeDialog dialog, MoneyDisplay display, ExchangeRate exchangeRate) {
        this.dialog = dialog;
        this.display = display;
        this.exchangeRate = exchangeRate;
        exchanger = new Exchanger();
    }
    
    public void execute(){
        Money money = exchanger.exchange(dialog.getExchange().getMoney(), exchangeRate);
        display.display(money);
    }
}