package MinhQuery.cau4;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery4 {
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
    public static ObservableList<class4> getInf4()
    {
        DatabaseConnectionQuery4 connectionNow = new DatabaseConnectionQuery4();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class4> listInf4 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("SELECT nv.manv,nv.hoten,nv.ngaysinh,nv.quequan,nv.dantoc,nv.sdt,cv.tencv,tt.ngaytiepnhan" +
                            " FROM nhanvien nv,thangtien tt,chucvu cv" +
                            " WHERE nv.manv=tt.manv AND nv.macv=cv.macv AND (EXTRACT(YEAR FROM NOW())-EXTRACT(YEAR FROM tt.ngaytiepnhan)) <=+1");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf4.add(new class4(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        Date.valueOf(resultSet.getString("ngaysinh")),
                        resultSet.getString("quequan"),
                        resultSet.getString("dantoc"),
                        resultSet.getString("sdt"),
                        resultSet.getString("tencv"),
                        Date.valueOf(resultSet.getString("ngaytiepnhan"))));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf4;
    }
}
