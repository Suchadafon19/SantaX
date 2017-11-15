package onlinestore;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBuilder {
    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String URL = "jdbc:derby://localhost:1527/OnlineStoreNAJA";
    public static final String USERNAME = "dbproject";
    public static final String PASSWORD = "123456789";
    
    private static boolean isLoaded = false;
    public static Connection getConnection(){
        Connection conn = null;
        try{
            if(!isLoaded){
                Class.forName(DRIVER);
                isLoaded = true;
            }
            conn = DriverManager.getConnection(URL,URL,PASSWORD);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return conn;
    }
}
