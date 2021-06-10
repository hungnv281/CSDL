package BangLuong;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionBL {
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

    public static ObservableList<BL> getBL()
    {
        DatabaseConnectionBL connectionNow = new DatabaseConnectionBL();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<BL> listBL = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT * FROM luong ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listBL.add(new BL(
                        resultSet.getString("bacluong"),
                        Float.parseFloat(resultSet.getString("luongcb")),
                        Float.parseFloat(resultSet.getString("hsluong")),
                        Float.parseFloat(resultSet.getString("hsphucap"))
                )
                );
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listBL;
    }

}
