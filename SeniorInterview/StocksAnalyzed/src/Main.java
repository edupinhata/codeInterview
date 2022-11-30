import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        GrouppedRequestor gr = new GrouppedRequestor();
        ArrayList<Ticker> tickerList = gr.requestTickers("2022-11-28");

        // Variacao absoluta
        tickerList.sort((t1, t2) -> {
            double var1 = Math.abs(t1.tickerDays.get(0).variation);
            double var2 = Math.abs(t2.tickerDays.get(0).variation);

            if(var1 == var2)
                return 0;
            return var1 > var2 ? -1 : 1;
        });

        int count=0;
        for (Ticker ticker : tickerList) {
            System.out.println(ticker);
            if (count > 5) break;
            count++;
        }

        System.out.println("\nTOP 3 past variation");
        System.out.println("==============================");

        // Variacao de alguns dias passados
        AggregateRequestor ar = new AggregateRequestor();
        for (int i=0; i<3; i++) {
            System.out.println(ar.requestTickerDays(tickerList.get(i).getName(), "2022-11-22", "2022-11-28"));
        }
    }
}