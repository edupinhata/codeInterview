import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class AggregateRequestor extends Requestor {

    public String request(String ticker, String startDate, String endDate){
        String grouppedURL = String.format("https://api.polygon.io/v2/aggs/ticker/%s/range/1/day/%s/%s?adjusted=true&sort=asc&limit=120&apiKey=%s",
                ticker,
                startDate,
                endDate,
                apiKey);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(grouppedURL))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try{
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response.body();
    }

    public Ticker requestTickerDays(String tickerName, String startDate, String endDate){
        String response = request(tickerName, startDate, endDate);
        JSONObject jsonResponse = responseToJSON(response);
        JSONArray results = (JSONArray) jsonResponse.get("results");

        Ticker ticker = null;

        for (Object it : results){
            JSONObject tickerJson = (JSONObject) it;
            double open = ToDouble(tickerJson.get("o"));
            double close = ToDouble(tickerJson.get("c"));
            double higher = ToDouble(tickerJson.get("h"));
            double lower = ToDouble(tickerJson.get("l"));

            if (ticker == null){
               ticker = new Ticker(tickerName, startDate, open, close, higher, lower);
            }
            else{
                ticker.addTrickerDay(endDate, open, close, higher, lower);
            }
        };

        return ticker;
    }
}
