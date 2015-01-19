package Model;

public class Currency {
    private final String symbol;
    private final String name;
    private final String code;

    public Currency(String name, String code, String symbol) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return code;
    }
}