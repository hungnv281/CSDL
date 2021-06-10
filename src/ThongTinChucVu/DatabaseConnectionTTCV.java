package ThongTinChucVu;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionTTCV {
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
    public static ObservableList<ChucVu> getCV(){
        DatabaseConnectionTTCV connectionNow = new DatabaseConnectionTTCV();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<ChucVu> listCV = FXCollections.observableArrayList();
        try{
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT * FROM chucvu ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listCV.add(new ChucVu(
                        resultSet.getString("macv"),
                        resultSet.getString("tencv")));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listCV;
    }
}
