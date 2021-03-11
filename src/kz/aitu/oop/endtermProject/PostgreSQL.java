package kz.aitu.oop.endtermProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQL implements DBСonnection {
    @Override
    public Connection connect(String url, String user, String password) {
        return null;
    }

    @Override
    public String execSQL(String sql, String[] params) {
        return null;
    }

    @Override
    public void Stop() {

    }

//    private static Connection con;
//    private static Statement stmt;
//    private static ResultSet rs;
//
//    @Override
//    public Connection connect(String url,String user,String password) {
//
//
//        try {
//            con = DriverManager.getConnection(url, user, password);
//
//            stmt = con.createStatement();
//
//        } catch (SQLException sqlEx) {
//            sqlEx.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public String execSQL(String sql, String[] params) {
//        System.out.println("Select DB interaction");
//        System.out.println("I - insert; U - update; D - delete");
//        char Answer = Input.AnsweringQuestion();
//        if (Answer == 'I') {
//            try {
//                String query = "insert into degrees(Celsius, Kelvin, Fahrenheit) values ('"
//                        + params[0] + "','" + params[1] + "','" + params[2] + "')";
//                //stmt = con.createStatement();
//                stmt.executeUpdate(query);
//                //System.out.println("done");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        if (Answer == 'U') {
//            System.out.println("Where Id number is");
//            int id = Input.SetId();
//            try {
//                String query = "UPDATE degrees SET Celsius = '" + params[0]
//                        + "', Kelvin = '" + params[1]
//                        + "', Fahrenheit = '" + params[2]
//                        + "' WHERE id = '" + id + "';";
//                stmt = con.createStatement();
//                stmt.executeUpdate(query);
//                //System.out.println("done");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        if (Answer == 'D') {
//            System.out.println("Where Id number is");
//            int id = Input.SetId();
//            try {
//                String query = "DELETE FROM degrees WHERE id = '" + id + "';";
//                stmt = con.createStatement();
//                stmt.executeUpdate(query);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//    @Override
//    public void Stop(){
//        try {
//            String query = "select * from degrees where Celsius = 0;";
//            rs = stmt.executeQuery(query);
//
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String Celsius = rs.getString(2);
//                String Fahrenheit = rs.getString(3);
//                String Kelvin = rs.getString(4);
//                System.out.printf("id: %d, Celsius: %s, Fahrenheit: %s, Kelvin: %s %n", id, Celsius, Fahrenheit, Kelvin);
//            }
//        }catch (SQLException sqlEx) {
//            sqlEx.printStackTrace();
//        } finally {
//
//
//            try {
//                con.close();
//            } catch (SQLException se) { /*can't do anything */ }
//            try {
//                stmt.close();
//            } catch (SQLException se) { /*can't do anything */ }
//            try {
//                rs.close();
//            } catch (SQLException se) { /*can't do anything */ }
//        }
//    }
}
