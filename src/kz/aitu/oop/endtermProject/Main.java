package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Interfaces.DBСonnection;
import kz.aitu.oop.endtermProject.Interfaces.UserAccount;

public class Main {
    public static void main(java.lang.String[] args) {
        DBСonnection dbc;
        dbc = new PostgreSQL();
        String url = "jdbc:postgresql://localhost:5432/JavaOOP_Endterm";
        String user = "postgres";
        String password = "1291";
        dbc.connect(url, user, password);
        dbc.execSQL();
        UserAccount UserAc = new User();
        GUI.uiMethod();
        System.out.println();

    }
}
