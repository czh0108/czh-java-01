package common;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GetValueTest {

    @Test
    public void testGetValueByKey() {
        GetValue.getValueByKey("msg");
    }
}