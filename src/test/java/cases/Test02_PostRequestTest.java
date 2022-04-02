package cases;

import common.Function;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Test02_PostRequestTest {

    @Test
    public void testMain() throws IOException {
        Function.httpPost("");
    }
}