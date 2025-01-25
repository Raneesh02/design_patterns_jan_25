package tests;

import org.testng.annotations.Test;
import utilities.DbUtilSingleton;

public class DBUtilEarlyInitIssue {

    @Test
    public void test5(){
        DbUtilSingleton.printConfig();
    }
}
