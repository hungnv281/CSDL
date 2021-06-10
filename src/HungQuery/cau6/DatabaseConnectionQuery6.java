package HungQuery.cau6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnectionQuery6 {
    public Connection DatabaseLink;
    public Connection ConnectionDb()
    {
        String DatabaseName="qlns1";
        String DatabaseUser="postgres";
        String Databasepass="admin";
        String url= "jdbc:postgresql://localhost:5432/" + DatabaseName;
        try
        {
            Class.forName("org.postgresql.Driver");
            DatabaseLink= DriverManager.getConnection(url,DatabaseUser,Databasepass);

        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return DatabaseLink;
    }

    public static ObservableList<class6> getInf6()
    {
        DatabaseConnectionQuery6 connectionNow = new DatabaseConnectionQuery6();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class6> listInf6 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("insert into thangtien(manv,macv,mapb,ngaytiepnhan) values\n" +
                            "('20184154','06','101','2020-04-30');");
            preparedStatement.execute();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf6;
    }
}
