package TuanAnhQuery.cau1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery1 {
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

    public static ObservableList<class1> getInf1()
    {
        DatabaseConnectionQuery1 connectionNow = new DatabaseConnectionQuery1();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class1> listInf1 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT * FROM nhanvien WHERE quequan='quảng ninh'");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf1.add(new class1(
                        //manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong;
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        Date.valueOf(resultSet.getString("ngaysinh")),
                        resultSet.getString("quequan"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("dantoc"),
                        resultSet.getString("sdt"),
                        resultSet.getString("mapb"),
                        resultSet.getString("macv"),
                        resultSet.getString("matdhv"),
                        resultSet.getString("bacluong")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf1;
    }

}
