package MinhQuery.cau6;

import MinhQuery.cau5.DatabaseConnectionQuery5;
import MinhQuery.cau5.class5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionQuery6 {
    public Connection DatabaseLink;

    public Connection ConnectionDb() {
        String DatabaseName="qlns1";
        String DatabaseUser="postgres";
        String Databasepass="admin";
        String url = "jdbc:postgresql://localhost:5432/" + DatabaseName;
        try {
            Class.forName("org.postgresql.Driver");
            DatabaseLink = DriverManager.getConnection(url, DatabaseUser, Databasepass);

        } catch (Exception e) {
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
                    ("select nv.manv, nv.hoten, nv.quequan,nv.gioitinh,nv.sdt, tdhv.tentdhv, tdhv.cnganh\n" +
                            "from nhanvien nv, trinhdohocvan tdhv\n" +
                            "where nv.matdhv=tdhv.matdhv and tdhv.tentdhv='Đại Học' and tdhv.cnganh='Marketing'");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf6.add(new class6(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("quequan"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("sdt"),
                        resultSet.getString("tentdhv"),
                        resultSet.getString("cnganh")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf6;
    }
}
