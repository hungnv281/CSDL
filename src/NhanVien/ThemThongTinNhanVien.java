package NhanVien;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThemThongTinNhanVien {
    @FXML
    private TextField mnvText;

    @FXML
    private DatePicker nsDate;

    @FXML
    private TextField nsText;

    @FXML
    private TextField htText;

    @FXML
    private TextField qqText;

    @FXML
    private TextField gtText;

    @FXML
    private TextField dtText;

    @FXML
    private TextField sdtText;

    @FXML
    private TextField mpbText;

    @FXML
    private TextField mcvText;

    @FXML
    private TextField mtdhvText;

    @FXML
    private TextField blText;

    @FXML
    private TextField mhdText;

    @FXML
    private TextField lhdText;

    @FXML
    private  TextField nbdText;

    @FXML
    private DatePicker nbdDate;

    @FXML
    private  TextField nktText;

    @FXML
    private DatePicker nktDate;

    @FXML
    private TextField lcbText;

    @FXML
    private TextField hslText;

    @FXML
    private TextField hspcText;

    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

    public void ADD() throws SQLException {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        String verify1 = " INSERT INTO nhanvien(manv, hoten, ngaysinh, quequan, gioitinh, dantoc, sdt, mapb, macv, matdhv, bacLuong) values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connectDB.prepareStatement(verify1);
        try
        {
            preparedStatement.setString(1,mnvText.getText());
            preparedStatement.setString(2,htText.getText());
            preparedStatement.setDate(3,Date.valueOf(nsText.getText()));
            preparedStatement.setString(4,qqText.getText());
            preparedStatement.setString(5,gtText.getText());
            preparedStatement.setString(6,dtText.getText());
            preparedStatement.setString(7,sdtText.getText());
            preparedStatement.setString(8,mpbText.getText());
            preparedStatement.setString(9,mcvText.getText());
            preparedStatement.setString(10, mtdhvText.getText());
            preparedStatement.setString(11,blText.getText());
            preparedStatement.execute();

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        String verify2 = " INSERT INTO hopdonglaodong(mahd, manv, loaihd, ngaybd, ngaykt)values(?,?,?,?,?)";
        PreparedStatement preparedStatement1 = connectDB.prepareStatement(verify2);
        try
        {
            preparedStatement1.setString(1,mhdText.getText());
            preparedStatement1.setString(2,mnvText.getText());
            preparedStatement1.setString(3, lhdText.getText());
            preparedStatement1.setDate(4,Date.valueOf(nbdText.getText()));
            preparedStatement1.setDate(5,Date.valueOf(nktText.getText()));
           // preparedStatement.setDate(4,Date.valueOf(String.valueOf(nbdDate.getDayCellFactory())));
           // preparedStatement.setDate(5,Date.valueOf(String.valueOf(nktDate.getDayCellFactory())));
            preparedStatement1.execute();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
       /* String verify3 = " INSERT INTO luong(bacluong, luongcb, hsluong, hsphucap)values(?,?,?,?)";
        PreparedStatement preparedStatement2 = connectDB.prepareStatement(verify3);
        try
        {
            preparedStatement2.setString(1,blText.getText());
            preparedStatement2.setDouble(2, Double.parseDouble(lcbText.getText()));
            preparedStatement2.setDouble( 3, Double.parseDouble(hslText.getText()));
            preparedStatement2.setDouble(4, Double.parseDouble(hspcText.getText()));
            preparedStatement2.execute();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
*/
    }
    public void cancelButtonOnAction()
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
