public class TickerDay {
    public String date;
    public double open;
    public double close;
    public double higher;
    public double lower;
    public double variation;

    public TickerDay(String date, double open, double close, double higher, double lower) {
        this.date = date;
        this.open = open;
        this.close = close;
        this.higher = higher;
        this.lower = lower;
        this.variation = higher-lower;
    }

    public String toString()
    {
        return String.format("[%s]: o: %9.2f | c: %9.2f | h:%9.2f | l: %9.2f | var: %9.2f ",
                this.date,
                this.open,
                this.close,
                this.higher,
                this.lower,
                this.variation);
    }
}
