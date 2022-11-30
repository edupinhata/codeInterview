import java.util.ArrayList;

public class Ticker {

    private String name;
    public ArrayList<TickerDay> tickerDays;

     public Ticker(String name, String date, double open, double close, double higher, double lower) {
        tickerDays = new ArrayList<>();
        this.name = name;
        tickerDays.add(new TickerDay(date, open, close, higher,lower));
    }

    public String getName(){
         return name;
    }

    public void addTrickerDay(String date, double open, double close, double higher, double lower)
    {
        tickerDays.add(new TickerDay(date, open, close, higher,lower));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("%5s: ", this.name));
        tickerDays.forEach(tickerDay -> {
            sb.append("\n" + tickerDay.toString());
        });
        return sb.toString();
    }
}
