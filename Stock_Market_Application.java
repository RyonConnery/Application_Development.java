/**
 * Represents a stock with identifying information and price data.
 * The stock symbol and company name are immutable after construction,
 * while the current and last closing prices can be updated.
 */
public class Stock {
    private final String symbol;
    private final String name;
    private double currentPrice;
    private double lastClosingPrice;

    public Stock(String symbol, String name,
            double currentPrice, double lastClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastClosingPrice = lastClosingPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getLastClosingPrice() {
        return lastClosingPrice;
    }

    public void setLastClosingPrice(double lastClosingPrice) {
        this.lastClosingPrice = lastClosingPrice;
    }

    public double getPriceChange() {
        return currentPrice - lastClosingPrice;
    }

    public double getPercentageChange() {
        return (getPriceChange() / lastClosingPrice) * 100.0;
    }

    // Produces a formatted description of the Stock object.
    @Override
    public String toString() {
        return String.format(
                "Ticker Symbol: %s%n"
                + "Company Name: %s%n"
                + "Current Price: $%.2f%n"
                + "Last Closing Price: $%.2f%n"
                + "Price Change: $%.2f%n"
                + "Percentage Change: %.2f%%",
                symbol,
                name,
                currentPrice,
                lastClosingPrice,
                getPriceChange(),
                getPercentageChange());
    }
}
