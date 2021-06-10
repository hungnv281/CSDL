package MinhQuery.cau1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionQuery1 {
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

        public static ObservableList<class1> getInf1()
        {
            DatabaseConnectionQuery1 connectionNow = new DatabaseConnectionQuery1();
            Connection connectDB = connectionNow.ConnectionDb();
            ObservableList<class1> listInf1 = FXCollections.observableArrayList();
            try
            {
                PreparedStatement preparedStatement = connectDB.prepareStatement
                        ("SELECT pb.mapb,pb.tenpb,pb.sdtpb,pb.diachipb,count(nv.manv) AS soluong" +
                                " FROM phongban pb,nhanvien nv WHERE nv.mapb=pb.mapb " +
                                "AND pb.mapb IN (SELECT pb.mapb FROM phongban pb )" +
                                "GROUP BY pb.mapb,pb.tenpb,pb.sdtpb,pb.diachipb order by soluong ");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next())
                {
                    listInf1.add(new class1(
                            resultSet.getString("mapb"),
                            resultSet.getString("tenpb"),
                            resultSet.getString("sdtpb"),
                            resultSet.getString("diachipb"),
                            Integer.parseInt(resultSet.getString("soluong"))));
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                e.getCause();
            }
            return  listInf1;
        }

    }

