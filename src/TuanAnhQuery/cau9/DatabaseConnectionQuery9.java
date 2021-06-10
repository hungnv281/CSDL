package TuanAnhQuery.cau9;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery9 {
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

    public static ObservableList<class9> getInf9()
    {
        DatabaseConnectionQuery9 connectionNow = new DatabaseConnectionQuery9();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class9> listInf9 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("select nv.*,hdld.ngaykt from nhanvien nv , hopdonglaodong hdld " +
                            "where nv.manv=hdld.manv " +
                            "AND (2021-EXTRACT(YEAR from hdld.ngaykt)>=0) " +
                            "AND (12-EXTRACT(MONTH FROM hdld.ngaykt)>0)");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf9.add(new class9(
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
                        resultSet.getString("bacluong"),
                        Date.valueOf(resultSet.getString("ngaykt"))));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf9;
    }
}
