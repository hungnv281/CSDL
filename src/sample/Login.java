package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;
    @FXML
    private Text loginMessage;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    public void cancelButtonOnAction()
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void validateLogin()
    {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        String managerLogin = " SELECT count(*) FROM manager WHERE username_id = '"+ username.getText() +
                "' AND password_id = '"+ password.getText() + "'";
        try {
            Statement statement =connectDB.createStatement();
            ResultSet queryResult1 = statement.executeQuery(managerLogin);
            while (queryResult1.next())
            {
              if(queryResult1.getInt(1)==1 )
              {
                  //loginMessage.setText("dang nhap thanh cong");
                  quanLiForm();
              }
              else
              {
                  loginMessage.setText("Invalid login. Try again!");
              }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void quanLiForm()
    {
        try
        {
           Parent root = FXMLLoader.load(getClass().getResource("/QuanLi/QuanLi.fxml"));
            Stage quanLiStage=new Stage();
            quanLiStage.setTitle("Danh cho nguoi Quan Li");
            quanLiStage.setScene(new Scene(root, 1280, 700));
            quanLiStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
}
