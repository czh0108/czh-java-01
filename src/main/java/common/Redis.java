package common;

import redis.clients.jedis.Jedis;

public class Redis {
    public static void main(String[] args){
        //需要先下载zip包，启动服务，并添加maven依赖；如果无法连接检查下载的zip服务器版本，和当前的maven依赖是否兼容
        Jedis redis =new Jedis("localhost");
        System.out.println(redis.ping());
        redis.set("name","tim");
        System.out.println(redis.get("name"));
    }
}
