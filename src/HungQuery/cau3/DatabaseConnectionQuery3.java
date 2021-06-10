package HungQuery.cau3;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnectionQuery3 {
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

    public static ObservableList<class3> getInf3()
    {
        DatabaseConnectionQuery3 connectionNow = new DatabaseConnectionQuery3();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class3> listInf3 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("update nhanvien\n" +
                            "set matdhv = (select matdhv from trinhdohocvan where tentdhv = 'Đại Học'and cnganh = 'Kinh Tế'),\n" +
                            "\tbacluong = 'B6'\n" +
                            "where nhanvien.manv = '20184108' ");
            preparedStatement.execute();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf3;
    }
}
