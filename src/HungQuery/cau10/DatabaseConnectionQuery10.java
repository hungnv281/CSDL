package HungQuery.cau10;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseConnectionQuery10 {
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

        public static ObservableList<class10> getInf10()
        {
            HungQuery.cau9.DatabaseConnectionQuery9 connectionNow = new HungQuery.cau9.DatabaseConnectionQuery9();
            Connection connectDB = connectionNow.ConnectionDb();
            ObservableList<class10> listInf10 = FXCollections.observableArrayList();
            try
            {
                PreparedStatement preparedStatement = connectDB.prepareStatement
                        ("select nv.manv,nv.hoten,nv.quequan,pb.tenpb,tdhv.tentdhv\n" +
                                "from nhanvien nv\n" +
                                "\tinner join phongban pb on nv.mapb = pb.mapb\n" +
                                "\tinner join trinhdohocvan tdhv on nv.matdhv=tdhv.matdhv\n" +
                                "where quequan='vĩnh phúc' and tenpb='Kế Toán' and hoten like 'vũ%' ");
                ResultSet resultSet=preparedStatement.executeQuery();
                while (resultSet.next())
                {
                    listInf10.add(new class10(
                            resultSet.getString("manv"),
                            resultSet.getString("hoten"),
                            resultSet.getString("quequan"),
                            resultSet.getString("tenpb"),
                            resultSet.getString("tentdhv")));
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
