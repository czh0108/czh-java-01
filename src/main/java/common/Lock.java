package common;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

public class Lock {
    public static String md5Lock(String data){
        String res = DigestUtils.md5Hex(data);
        System.out.println(res);
        return res;
    }
}
