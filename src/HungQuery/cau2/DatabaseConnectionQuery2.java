package HungQuery.cau2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        DatabaseConnectionQuery2 connectionNow = new DatabaseConnectionQuery2();
        Connection connectDB = connectionNow.ConnectionDb();
        ObservableList<class2> listInf2 = FXCollections.observableArrayList();
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("select mapb,\n" +
                            "(select count(*) from nhanvien where mapb = pb.mapb and gioitinh = 'M') as number_employees_male ,\n" +
                            "(select count(*) from nhanvien where mapb = pb.mapb and gioitinh = 'F') as number_employees_female \n" +
                            "from phongban pb\n" +
                            "group by mapb\n" +
                            "having (select count(*) from nhanvien where mapb = pb.mapb and gioitinh = 'M') " +
                            "> (select count(*) from nhanvien where mapb = pb.mapb and gioitinh = 'F')");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                listInf2.add(new class2(
                        resultSet.getString("mapb"),
                        Integer.parseInt(resultSet.getString("number_employees_male")),
                        Integer.parseInt(resultSet.getString("number_employees_female"))));
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
