import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        GrouppedRequestor gr = new GrouppedRequestor();
        ArrayList<Ticker> tickerList = gr.requestTickers("2022-11-28");

        // Variacao absoluta
        tickerList.sort((t1, t2) -> {
            double var1 = Math.abs(t1.getVariation());
            double var2 = Math.abs(t2.getVariation());

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
    }
}