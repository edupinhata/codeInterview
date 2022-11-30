public class Ticker {

    private String name;
    private String date;
    private double open;
    private double close;
    private double higher;
    private double lower;
    private double variation;

     public Ticker(String name, String date, double open, double close, double higher, double lower) {
        this.name = name;
        this.date = date;
        this.open = open;
        this.close = close;
        this.higher = higher;
        this.lower = lower;
        this.variation = higher-lower;
    }

    public double getVariation() {
        return variation;
    }

    public String toString(){
        return String.format("%5s [%s]: o: %.2f | c: %.2f | h:%.2f | l: %.2f | var: %.2f",
                this.name,
                this.date,
                this.open,
                this.close,
                this.higher,
                this.lower,
                this.variation);
    }
}
