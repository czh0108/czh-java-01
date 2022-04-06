package cases;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Test01_GetRequest {
    public static void main(String[] args) throws IOException {
        //1.声明一个客户端对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.请求方法
        HttpGet get = new HttpGet("http://localhost:12306/getweather?city=hangzhou");
        //3.客户端对象调用请求,获得一个响应对象
        HttpResponse response = httpClient.execute(get);
        //4.获得一个http实体
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);
    }
}

