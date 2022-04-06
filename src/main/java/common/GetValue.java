package common;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GetValue {
    public static String getValueByKey(String key){
        String str1="{\r\n" +
                "  \"changeserial\": \"Gfdjjsvcx Ntxybesfy Pqikt\",\r\n" +
                "  \"msg\": \"出票请求已收\",\r\n" +
                "  \"orderid\": \"TGT_S57DF452F401\",\r\n" +
                "  \"ordernumber\": \"EF411150\",\r\n" +
                "  \"success\": \"TRUE\",\r\n" +
                "  \"transactionid\": \"5AEA6654C8B\",\r\n" +
                "  \"qkey\": \"e27cfdadb\"\r\n" +
                "}";
        JsonObject json = (JsonObject)new JsonParser().parse(str1);
        String value = json.get(key).getAsString();
        System.out.println(value);
        return null;
    }
}
