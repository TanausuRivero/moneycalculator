package UI.Swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import Model.Currency;
import UI.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    private ExchangeDialogPanel exchangeDialog;
    private DialogPanel area;
    ActionListener actionListener;
    final Currency[] currencies;
    
    
    public ApplicationFrame(Currency[] currencies){
        this.currencies = currencies;
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 300));
        createWidgets();
        setVisible(true);
    }

    private void createWidgets() {
        add(createTextDialog(), BorderLayout.CENTER);
        add(createExchangeDialog(), BorderLayout.PAGE_START);
        add(createCalculateButton(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = panel;
        return panel;
    }

    public ExchangeDialog getExchangeDialog(){
        return exchangeDialog;
    }
    
    private Component createTextDialog() {
        DialogPanel panel = new DialogPanel();
        this.area = panel;
        return panel;
    }
    
    
    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
                        
            }
        });
        return button;
    }
    
    public void register(ActionListener actionListener){
        this.actionListener= actionListener;
    }

    public DialogPanel getTextArea() {
        return area;
    } 
}