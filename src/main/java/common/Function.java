package common;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class Function {
    public static String httpGet(String url) throws IOException {
        //1.声明一个客户端对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.请求方法
        HttpGet get = new HttpGet(url);
        get.setHeader("Cookie","name=czh");
        //3.客户端对象调用请求,获得一个响应对象
        HttpResponse response = httpClient.execute(get);
        //4.获得一个http实体
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);
        return result;
    }
    public static String httpPost(String url,String body) throws IOException {
        //1.声明一个客户端对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建一个post请求对象
        HttpPost post = new HttpPost(url);
        //2.1设置请求头
        post.setHeader("content-type","application/json");
//        post.setHeader("Cookie","name=tim");
        //3.【设置post请求实体】
//        String str = "{\"city\":\"hangzhou\"}";
        String charset = "utf-8";
//        System.out.println(str);
//        StringEntity entity = new StringEntity("str","charset");
//        post.setEntity(entity);
        //3.[设置post请求实体]
        JSONObject strJson = new JSONObject();
        strJson.put("city","hangzhou");
        StringEntity entity = new StringEntity(body.toString(),charset);

        post.setEntity(entity);
        //4.客户端对象调用post请求,获得一个响应对象
        CloseableHttpResponse response = client.execute(post);
        //5.获取一个http实体
        HttpEntity responseEntity = response.getEntity();
        //6.调用实体工具类的toString方法
        String result = EntityUtils.toString(responseEntity);
        System.out.println(result);
        return result;
    }
}
