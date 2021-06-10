package MinhQuery.cau10;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionQuery10 {

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
    public static ObservableList<class10> getInf10()
    {
        DatabaseConnectionQuery10 connectionNow = new DatabaseConnectionQuery10();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class10> listInf10 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("   SELECT nv.manv,nv.hoten,nv.macv,cv.tencv\n" +
                            "FROM nhanvien nv, chucvu cv\n" +
                            "WHERE nv.macv=cv.macv and nv.macv='05'\n" +
                            "UNION\n" +
                            "SELECT nv.manv,nv.hoten,nv.macv,cv.tencv\n" +
                            "FROM nhanvien nv, chucvu cv,thangtien tt\n" +
                            "WHERE nv.macv=cv.macv and nv.manv=tt.manv and tt.macv='05'");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf10.add(new class10(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("macv"),
                        resultSet.getString("tencv")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf10;
    }
}
