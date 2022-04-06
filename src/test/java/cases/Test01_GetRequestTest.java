package cases;
import common.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Test01_GetRequestTest {

    @Test
    public void testMain() throws IOException {
        Function.httpGet("http://localhost:12306/getweather?city=hangzhou");
    }
}