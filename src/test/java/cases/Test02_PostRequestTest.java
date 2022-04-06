package cases;

import common.Function;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Test02_PostRequestTest {
    @Test
    public void test_01() throws IOException {
        //1、查询 POS1、查询 POST类型T类型
        Function.httpPost("http://localhost:12306/app/mock/16/search","{\n" +
                "\t\t\t\"train_date\":\"2018-07-07\",\n" +
                "\t\t\t\"from_station\":\"SZ\",\n" +
                "\t\t\t\"to_station\":\"SH\",\n" +
                "\t\t\t\"purpose_codes\":\"ADULT\",\n" +
                "\t\t\t\"partnerid\":\"12306com\",\n" +
                "\t\t\t\"method\":\"train_query\",\n" +
                "\t\t\t\"reqtime\":\"20180703092001\",\n" +
                "\t\t\t\"sign\":\" b4fb24449789a38427ac178fc5c4d1e0\"\n" +
                "\t\t}");
    }
    @Test
    public void test_02() throws IOException {
        //2、申请出票
        String body = "{\n" +
                "\t\"orderid\": \"TGT_S57DF452F401045C\",\n" +
                "\t\"transactionid\": \"5AEA6654C8B\",\n" +
                "\t\"operationtype\": \"2\",\n" +
                "\t\"isdirectpay\": \"FALSE\",\n" +
                "\t\"serialnumber\": \"FT5AUA664D1005B93B0A8339\",\n" +
                "\t\"partnerid \": \"xiaowuguicom \",\n" +
                "\t\"method \": \"train_confirm \",\n" +
                "\t\"reqtime \": \"20180503093126 \",\n" +
                "\t\"sign \": \"916972e27 c445244f48124e36ded74c6 \"\n" +
                "}";
        Function.httpPost("http://localhost:12306/app/mock/16/applysuply","body");


    }
}