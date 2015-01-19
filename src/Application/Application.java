package Application;

import UI.Swing.MoneyDisplay;
import Controller.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Currency;
import Model.CurrencySet;
import Persistence.File.CurrencySetLoader;
import Persistence.File.ExchangeRateLoader;
import UI.Swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                Currency in = frame.getExchangeDialog().getExchange().getMoney().getCurrency();
                Currency out = frame.getExchangeDialog().getExchange().getCurrency();
                ExchangeOperation operation = new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay(frame), new ExchangeRateLoader().load(in, out));
                operation.execute();
            }
        });
    }
}
