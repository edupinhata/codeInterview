import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        GrouppedRequestor gr = new GrouppedRequestor();
        ArrayList<Ticker> tickerList = gr.requestTickers("2022-11-28");

        tickerList.sort((t1, t2) -> {
           if(t1.getVariation() == t2.getVariation())
               return 0;
           return t1.getVariation() > t2.getVariation() ? -1 : 1;
        });

        int count=0;
        for (Ticker ticker : tickerList) {
            System.out.println(ticker);
            if (count > 5) break;
            count++;
        }
    }
}