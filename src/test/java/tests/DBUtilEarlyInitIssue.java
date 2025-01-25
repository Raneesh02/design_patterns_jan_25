package tests;

import org.testng.annotations.Test;
import utilities.DbUtilSingleton;

public class DBUtilEarlyInitIssue {

    @Test
    public void test5(){
        DbUtilSingleton.printConfig();
    }


    @Test
    public void test6(){
        DbUtilSingleton instance = DbUtilSingleton.getInstance();
        instance.runQuery("select * test6");
    }
}
