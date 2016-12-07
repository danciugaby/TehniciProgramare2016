/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstconnection;

import java.sql.*;

/**
 *
 * @author gabriel.danciu
 */
public class FirstConnection {

    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://danciugabyserver.database.windows.net:1433;database=DBFiles;user=gaby;password=Tehnicideprogramare2016;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        Statement stm = null;
        String SQLcommand = null;
        try {
            //register JDBC driver
            Class.forName(JDBC_DRIVER);
            //open connection
            conn = DriverManager.getConnection(DB_URL);
            //create SQL statement
            stm = conn.createStatement();
            //create SQL command
            SQLcommand = "Select * from Persons";
            //Execute the command, collect the result
            ResultSet rs = stm.executeQuery(SQLcommand);
            while (rs.next()) {
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                String adress = rs.getString("Address");
                System.out.println(first);
                System.out.println(last);
                System.out.println(adress);
            }
            //close connections
            rs.close();
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
