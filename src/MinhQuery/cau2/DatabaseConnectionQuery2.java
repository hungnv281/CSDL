package MinhQuery.cau2;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery2 {
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

    public static ObservableList<class2> getInf2()
    {
        MinhQuery.cau1.DatabaseConnectionQuery1 connectionNow = new MinhQuery.cau1.DatabaseConnectionQuery1();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class2> listInf2 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT nv.manv,nv.hoten,nv.ngaysinh,nv.quequan,nv.gioitinh,nv.dantoc,nv.sdt,hdld.ngaybd" +
                            " FROM nhanvien nv,hopdonglaodong hdld" +
                            " WHERE nv.manv=hdld.manv AND EXTRACT(YEAR FROM hdld.ngaybd)='2020'");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf2.add(new class2(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("ngaysinh"),
                        resultSet.getString("quequan"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("dantoc"),
                        resultSet.getString("sdt"),
                        Date.valueOf(resultSet.getString("ngaybd"))));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf2;
    }

}

