package common;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Mysql{

    public static void main(String[] args) throws FileNotFoundException {

        String driveName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/inter?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC\r\n" +
                "";
        String user = "root";
        String pass = "root";
        try {
            Class.forName(driveName);

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement state = con.createStatement();
            String querySql = "select * from user";
            ResultSet result = state.executeQuery(querySql);
            while(result.next()) {
                System.out.println("id_" + result.getString("user"));

                System.out.println();
            }

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
