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
    public int tableLength() {
        int counter = 0;
        try {

            String query = "select * from Account";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                counter++;

            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return counter;
    }

    @Override
    public String execSQL(String returner, int counter) {
        try {
            if (counter < tableLength()) {
            String query = "select * from Account where Account_id = " + counter + 1;
            rs = stmt.executeQuery(query);
            while (rs.next()) {

                    int Account_id = rs.getInt(1);
                    String Account_Login = rs.getString(2);
                    //String Account_Password = rs.getString(3);
                    //System.out.printf("Account_id: %d, Account_login: %s, Account_password: %s %n", Account_id, Account_Login, Account_Password);
                    //System.out.printf("id %d,l %s %n",Account_id, Account_Login);
                    returner = Account_Login;

                }
            }


        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return returner;
    }

    @Override
    public void Stop() {

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

