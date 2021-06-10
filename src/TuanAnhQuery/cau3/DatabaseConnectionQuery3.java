package TuanAnhQuery.cau3;

import TuanAnhQuery.cau2.DatabaseConnectionQuery2;
import TuanAnhQuery.cau2.class2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

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
                    ("select nv.hoten, cv.tencv,pb.tenpb " +
                            "from nhanvien nv, chucvu cv, phongban pb" +
                            " where nv.macv=cv.macv and nv.mapb=pb.mapb");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf3.add(new class3(
                        resultSet.getString("hoten"),
                        resultSet.getString("tenCV"),
                        resultSet.getString("tenPB")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf3;
    }
}
