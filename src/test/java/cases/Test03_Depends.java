package cases;

import org.testng.annotations.Test;

public class Test03_Depends {
    @Test(dependsOnMethods = {"test_02"})
    public void test_01(){
        String a = "i run dependson test_02";
        System.out.println(a);
    }
    @Test
    public void test_02(){
        String b = "i'm test_02,run first";
        System.out.println(b);

    }
}
