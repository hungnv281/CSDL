package MinhQuery.cau5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery5 {
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
    public static ObservableList<class5> getInf5()
    {
        DatabaseConnectionQuery5 connectionNow = new DatabaseConnectionQuery5();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class5> listInf5 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT nv.manv,nv.hoten,nv.ngaysinh,nv.quequan,nv.sdt,(bl.luongcb*(bl.hsluong)) AS tienluong " +
                            "FROM nhanvien nv,luong bl " +
                            "WHERE nv.bacluong=bl.bacluong " +
                            "group by nv.manv,nv.hoten,nv.ngaysinh,nv.quequan,nv.sdt,bl.luongcb,bl.hsluong,bl.hsphucap" +
                            " HAVING (bl.luongcb*(bl.hsluong))>=35");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf5.add(new class5(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("ngaysinh"),
                        resultSet.getString("quequan"),
                        resultSet.getString("sdt"),
                        Double.valueOf(resultSet.getString("tienluong"))));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf5;
    }
}
