package commercialData;

public class Operations {
    private int amount;
    private String symbol;
    private int buy;
    private int sell;

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public Operations(int amount, String symbol, int buy) {
        this.amount = amount;
        this.symbol = symbol;
        this.buy = buy;
    }




    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
