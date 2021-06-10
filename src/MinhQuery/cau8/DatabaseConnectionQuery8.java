package MinhQuery.cau8;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery8 {

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
    public static ObservableList<class8> getInf8()
    {
        DatabaseConnectionQuery8 connectionNow = new DatabaseConnectionQuery8();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class8> listInf8 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("select tt.manv,cv.tencv,pb.tenpb, tt.ngaytiepnhan,tt.ngayketthuc\n" +
                            "from thangtien tt ,chucvu cv, phongban pb\n" +
                            "where tt.manv='20184150' and tt.macv=cv.macv and pb.mapb=tt.mapb");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf8.add(new class8(
                        resultSet.getString("manv"),
                        resultSet.getString("tencv"),
                        resultSet.getString("tenpb"),
                        Date.valueOf(resultSet.getString("ngayketthuc")),
                        Date.valueOf((resultSet.getString("ngaytiepnhan")))));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf8;
    }
}
