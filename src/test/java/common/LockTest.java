package common;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import common.*;
public class LockTest {
    @Test
    public void testMd5Lock() {
        Lock.md5Lock("2022-04-06");
    }
}