package kz.aitu.oop.endtermProject.Interfaces;

import java.sql.Connection;

public interface DBСonnection {

    public Connection connect(String url, String user, String password);
    public String execSQL ();

    public void Stop();


    //public void GetConnectionResult();
}
