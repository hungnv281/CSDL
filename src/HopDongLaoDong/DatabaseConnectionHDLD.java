package HopDongLaoDong;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DatabaseConnectionHDLD {
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

        public static ObservableList<HDLD> getHDLD()
        {
            DatabaseConnectionHDLD connectionNow = new DatabaseConnectionHDLD();
            Connection connectDB = connectionNow.ConnectionDb();
            ObservableList<HDLD> listHDLD = FXCollections.observableArrayList();
            try
            {
                PreparedStatement preparedStatement = connectDB.prepareStatement
                        ("SELECT * FROM hopdonglaodong ");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next())
                {
                    listHDLD.add(new HDLD(
                            resultSet.getString("maHD"),
                            resultSet.getString("maNV"),
                            resultSet.getString("loaiHD"),
                            resultSet.getDate("ngayBD"),
                            resultSet.getDate("ngayKT")));
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                e.getCause();
            }
            return  listHDLD;
        }

    }
