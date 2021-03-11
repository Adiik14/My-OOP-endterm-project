package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Interfaces.DBСonnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQL implements DBСonnection {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    @Override
    public Connection connect(String url,String user,String password) {
        try {
            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return null;
    }

    @Override
    public String execSQL(String sql, String[] params) {
        return null;
    }

    @Override
    public void Stop() {
        try {
            String query = "";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String Login = rs.getString(2);
                String Password = rs.getString(3);
                //System.out.printf("id: %d, Celsius: %s, Fahrenheit: %s, Kelvin: %s %n", id, Login, Password, Kelvin);
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) { /*can't do anything */ }
        }
    }
}
