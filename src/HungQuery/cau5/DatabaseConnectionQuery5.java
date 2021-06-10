package HungQuery.cau5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery5 {

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

    public static ObservableList<class5> getInf5()
    {
        DatabaseConnectionQuery5 connectionNow = new DatabaseConnectionQuery5();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class5> listInf5 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("select nv.manv, nv.hoten, nv.ngaysinh, nv.sdt\n" +
                            "from nhanvien nv\n" +
                            "where cast(extract(month from ngaysinh) as varchar(2) )= substring(sdt,length(sdt)-1,length(sdt))\n" +
                            "or cast(extract(day from ngaysinh) as integer )= cast(substring(sdt,length(sdt)-2,length(sdt)) as integer)");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                listInf5.add(new class5(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        Date.valueOf(resultSet.getString("ngaysinh")),
                        resultSet.getString("sdt")));
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
