package utilities;

public class DbUtilSingleton {

    private DbUtilSingleton(){
        System.out.println("DbUtilSingleton Constructor called, Database connection opened");
        //initialize connection
    }

    // Early Initialization
//    final static DbUtilSingleton dbUtilSingleton = new DbUtilSingleton();

//    static public DbUtilSingleton getInstance(){
//        return  dbUtilSingleton;
//    }


    // Early Initialization

    //Lazy Initialization
    static DbUtilSingleton dbUtilSingleton = null;

    static public DbUtilSingleton getInstance(){
        if(dbUtilSingleton!=null){
            return  dbUtilSingleton;
        }
        dbUtilSingleton = new DbUtilSingleton();
        return dbUtilSingleton;
    }

    //Lazy Initialization


    public void runQuery(String query){
        System.out.println("Query : "+ query + " ran");
    }

    public static void printConfig(){
        System.out.println("DbUtil Configuration");
    }

}