package ThangTien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionTT {
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

    public static ObservableList<TT> getTT()
    {
        DatabaseConnectionTT connectionNow = new DatabaseConnectionTT();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<TT> listTT = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT * FROM thangtien ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listTT.add(new TT(
                                resultSet.getString("manv"),
                                resultSet.getString("macv"),
                                resultSet.getString("mapb"),
                                Date.valueOf(resultSet.getString("ngaytiepnhan")),
                                Date.valueOf(resultSet.getString("ngaytiepnhan"))));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listTT;
    }

}
