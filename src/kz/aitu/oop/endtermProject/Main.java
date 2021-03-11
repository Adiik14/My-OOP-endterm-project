package kz.aitu.oop.endtermProject;

public class Main {
    public static void main(java.lang.String[] args) {
        DBСonnection dbc;
        dbc = new PostgreSQL();
        String url = "jdbc:postgresql://localhost:5432/JavaOOP_HW4";
        String user = "postgres";
        String password = "1291";

        dbc.connect(url, user, password);

    }
}
