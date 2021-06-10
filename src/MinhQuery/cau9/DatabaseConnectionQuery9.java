package MinhQuery.cau9;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery9 {

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
    public static ObservableList<class9> getInf9()
    {
        DatabaseConnectionQuery9 connectionNow = new DatabaseConnectionQuery9();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class9> listInf9 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("select nv.manv,nv.hoten,nv.sdt,cv.tencv,pb.tenpb,hdld.ngaybd,\n" +
                            "( (extract(year from now())-extract(year from hdld.ngaybd)) +(extract(month from now())-extract(month from hdld.ngaybd))/12) as thoigian\n" +
                            "\n" +
                            "from nhanvien nv, chucvu cv, phongban pb, hopdonglaodong hdld\n" +
                            "where nv.macv=cv.macv and nv.mapb=pb.mapb and nv.manv NOT IN(select thangtien.manv from thangtien) and now()>hdld.ngaybd\n" +
                            "order by thoigian desc limit 10");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf9.add(new class9(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("sdt"),
                        resultSet.getString("tencv"),
                        resultSet.getString("tenpb"),
                        Date.valueOf(resultSet.getString("ngaybd")),
                        Float.parseFloat(resultSet.getString("thoigian"))));
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
