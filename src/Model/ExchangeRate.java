package Model;

public class ExchangeRate {

    private final Currency in;
    private final Currency out;
    private final double rate;

    public ExchangeRate(Currency in, Currency out, double rate) {
        this.in = in;
        this.out = out;
        this.rate = rate;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getRate() {
        return rate;
    }
}