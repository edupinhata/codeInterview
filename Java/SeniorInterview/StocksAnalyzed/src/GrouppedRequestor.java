import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GrouppedRequestor extends Requestor {

    public String request(String date){
        String grouppedURL = String.format("https://api.polygon.io/v2/aggs/grouped/locale/us/market/stocks/%s?adjusted=true&apiKey=%s",
                date,
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

    private JSONObject responseToJSON(String response){
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = new JSONObject();

        try{
            jsonObject = (JSONObject) jsonParser.parse(response);
        } catch(Exception e){
            System.out.println("Failed to parse response to array");
        }
        return jsonObject;
    }

    public ArrayList<Ticker> requestTickers(String date){
        String response = request(date);
        JSONObject jsonResponse = responseToJSON(response);
        JSONArray results = (JSONArray) jsonResponse.get("results");

        ArrayList<Ticker>  tickerList = new ArrayList<Ticker>();

        results.forEach( it -> {
            JSONObject tickerJson = (JSONObject) it;
            try {
                String name = (String) tickerJson.get("T");
                double open = ToDouble(tickerJson.get("o"));
                double close = ToDouble(tickerJson.get("c"));
                double higher = ToDouble(tickerJson.get("h"));
                double lower = ToDouble(tickerJson.get("l"));
                tickerList.add(new Ticker(name, date, open, close, higher, lower));
            }catch (Exception e){
                System.out.println("Could not parse: " + tickerJson.toString());
                e.printStackTrace();
            }
        });
        return tickerList;
    }

    private double ToDouble(Object numObj){
       Number num = (Number) numObj;
       return num.doubleValue();
    }
}
