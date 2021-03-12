package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Interfaces.DBСonnection;
import kz.aitu.oop.endtermProject.Interfaces.UserAccount;

public class Main {
    static DBСonnection dbc = new PostgreSQL();
    //public static String[] log = new String[dbc.tableLength()];
    public static String log = new String();
    static GUI UI = new GUI();
    public static void main(java.lang.String[] args) {

        String url = "jdbc:postgresql://localhost:5432/JavaOOP_Endterm";
        String user = "postgres";
        String password = "1291";
        dbc.connect(url, user, password);
        UI.uiMethod();
//        for (int i = 0; i < dbc.tableLength(); i++) {
//            log = dbc.execSQL(log, i);
//            System.out.println(log);
//            System.out.println(LoginChecker.algorithm());
//        }

        UserAccount UserAc = new User();

        System.out.println(dbc.tableLength() + " " + GUI.GetUserLogin());

    }
}
