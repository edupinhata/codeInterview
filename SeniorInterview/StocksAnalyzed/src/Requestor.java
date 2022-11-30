import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Requestor {
    protected String apiKey = "NRy6N2tshufPPrpGwRrjwr855NdH9tpT";

    protected JSONObject responseToJSON(String response){
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = new JSONObject();

        try{
            jsonObject = (JSONObject) jsonParser.parse(response);
        } catch(Exception e){
            System.out.println("Failed to parse response to array");
        }
        return jsonObject;
    }

    protected double ToDouble(Object numObj){
       Number num = (Number) numObj;
       return num.doubleValue();
    }
}
