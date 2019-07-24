package za.wethinkcode.swingy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_Conn {
    public Connection getConn(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.driver");
             connection = DriverManager.getConnection("jdbc::mysql//localhost:3306/test", "root", "");
        } catch (Exception e) {
            System.out.println("Database Connection error : " + e);
        }
        return connection;
    }
}