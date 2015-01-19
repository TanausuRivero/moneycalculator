package Model;

public class Money {
    private final double Amount;
    private final Currency currency;
    
    public Money(double Amount, Currency currency) {
        this.Amount = Amount;
        this.currency = currency;
    }

    public double getAmount() {
        return Amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}