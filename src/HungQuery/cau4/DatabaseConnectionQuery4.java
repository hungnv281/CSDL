package HungQuery.cau4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnectionQuery4 {
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


     static Boolean getInf4()
    {
        DatabaseConnectionQuery4 connectionNow = new DatabaseConnectionQuery4();
        Connection connectDB = connectionNow.ConnectionDb();
        Boolean check = null;
        try
        {
            PreparedStatement preparedStatement = connectDB.prepareStatement
                    ("update nhanvien\n" +
                            "set mapb = (select mapb from phongban where tenpb = 'Sản Xuất')\n" +
                            "where nhanvien.manv = '20184033'");
             check= preparedStatement.execute();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return check;
    }
}
