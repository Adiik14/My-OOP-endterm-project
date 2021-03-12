package kz.aitu.oop.endtermProject.Interfaces;

import java.sql.Connection;

public interface DBСonnection {

    public Connection connect(String url, String user, String password);
    public String execSQL (String returner, int counter);

    public void Stop();

    int tableLength();


    //public void GetConnectionResult();
}
