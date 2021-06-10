package MinhQuery.cau7;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionQuery7 {

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
    public static ObservableList<class7> getInf7()
    {
        DatabaseConnectionQuery7 connectionNow = new DatabaseConnectionQuery7();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class7> listInf7 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    (" select nv.manv, nv.hoten,nv.quequan,nv.sdt, tdhv.tentdhv,cv.tencv,pb.tenpb\n" +
                            "from nhanvien nv, trinhdohocvan tdhv, chucvu cv,phongban pb\n" +
                            "where nv.matdhv=tdhv.matdhv and nv.macv=cv.macv and nv.mapb=pb.mapb\n" +
                            "and tdhv.tentdhv='Đại Học' and nv.quequan IN('vĩnh phúc','hà nội','quảng ninh')");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf7.add(new class7(
                        resultSet.getString("manv"),
                        resultSet.getString("hoten"),
                        resultSet.getString("quequan"),
                        resultSet.getString("sdt"),
                        resultSet.getString("tentdhv"),
                        resultSet.getString("tencv"),
                        resultSet.getString("tenpb")));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return  listInf7;
    }
}
