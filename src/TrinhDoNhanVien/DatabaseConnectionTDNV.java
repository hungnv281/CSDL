package TrinhDoNhanVien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionTDNV {
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

    public static ObservableList<TDNV> getTDNV()
    {
        DatabaseConnectionTDNV connectionNow = new DatabaseConnectionTDNV();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<TDNV> listTDNV = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT * FROM trinhdohocvan ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listTDNV.add(new TDNV(
                        resultSet.getString("matdhv"),
                        resultSet.getString("tentdhv"),
                        resultSet.getString("cnganh")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listTDNV;
    }

}
