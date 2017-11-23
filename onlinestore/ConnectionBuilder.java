package onlinestore;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBuilder {
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:derby://localhost:1527/OnlineStoreNAJA"; 
//"jdbc:oracle:thin:@oraws01.sit.kmutt.ac.th:1521:orcl";
    public static final String USERNAME = "dbproject";  //DB59107";
    public static final String PASSWORD = "123456789";  //lovesql";
    
    private static boolean isLoaded = false;
    public static Connection getConnection(){
        Connection conn = null;
        try{
            if(!isLoaded){
                Class.forName(DRIVER);
                isLoaded = true;
            }
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return conn;
    }
}
