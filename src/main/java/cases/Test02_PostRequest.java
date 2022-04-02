package cases;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class Test02_PostRequest {
    public static void main(String[] args) throws IOException {
        //1.声明一个客户端对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建一个post请求对象
        HttpPost post = new HttpPost("");
            //2.1设置请求头
        post.setHeader("content-type","application/json");
//        post.setHeader("Cookie","name=tim");
        //3.【设置post请求实体】
//        String str = "{\"city\":\"hangzhou\"}";
//        String charset = "utf-8";
//        System.out.println(str);
//        StringEntity entity = new StringEntity("str","charset");
//        post.setEntity(entity);
        //3.[设置post请求实体]
        JSONObject strJson = new JSONObject();
        strJson.put("city","hangzhou");
        StringEntity entity = new StringEntity(strJson.toString(),"charset");

        post.setEntity(entity);
        //4.客户端对象调用post请求,获得一个响应对象
        CloseableHttpResponse response = client.execute(post);
        //5.获取一个http实体
        HttpEntity responseEntity = response.getEntity();
        //6.调用实体工具类的toString方法
        String result = EntityUtils.toString(responseEntity);
        System.out.println(result);
    }
}
