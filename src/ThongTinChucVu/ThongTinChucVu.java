package ThongTinChucVu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ThongTinChucVu implements Initializable {
    @FXML
    private  TableView<ChucVu> tableChucVu;
    @FXML
    private TableColumn<ChucVu,String> mcvColumn;
    @FXML
    private TableColumn<ChucVu,String> tcvColumn;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private  Button cancelButton;
    @FXML
    private  Button deleteButton;
    @FXML
    private TextField mcvText;
    @FXML
    private TextField tcvText;

    ObservableList<ChucVu> listCV = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mcvColumn.setCellValueFactory(new PropertyValueFactory<>("macv"));

        tcvColumn.setCellValueFactory(new PropertyValueFactory<>("tencv"));

        listCV = DatabaseConnectionTTCV.getCV();
        tableChucVu.setItems(listCV);
    }
    public void ADD() throws SQLException {
        DatabaseConnectionTTCV connectionNow = new DatabaseConnectionTTCV();
        Connection connectDB = connectionNow.ConnectionDb();
        String verify = " INSERT INTO chucvu(macv, tencv)  values (?,?)";
        PreparedStatement preparedStatement = connectDB.prepareStatement(verify);
        try{
            preparedStatement.setString(1,mcvText.getText());
            preparedStatement.setString(2,tcvText.getText());
            preparedStatement.execute();
            listCV = DatabaseConnectionTTCV.getCV();
            tableChucVu.setItems(listCV);
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    int index=-1;
    @FXML
    void getSelectedCV (MouseEvent event)
    {
        index=tableChucVu.getSelectionModel().getSelectedIndex();
        if(index<-1) {
            return;
        }
        mcvText.setText(mcvColumn.getCellData(index));
        tcvText.setText(tcvColumn.getCellData(index));
    }
    public void edit() {
        DatabaseConnectionTTCV connectionNow = new DatabaseConnectionTTCV();
        Connection connectDB = connectionNow.ConnectionDb();
        try {
            String value1 = mcvText.getText();
            String value2 = tcvText.getText();

            String sql = "UPDATE chucvu SET macv='" + value2 + "',tencv='" + value1 +
                    "' WHERE macv= '"+value1+"'" ;
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listCV = DatabaseConnectionTTCV.getCV();
            tableChucVu.setItems(listCV);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void delete() {
        DatabaseConnectionTTCV connectionNow = new DatabaseConnectionTTCV();
        Connection connectDB = connectionNow.ConnectionDb();
        try {
            String value2 = tcvText.getText();
            String value1 = mcvText.getText();
            String sql = "DELETE FROM chucvu WHERE macv= '" + value1 + "'and tencv='" + value2 + "'";
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listCV = DatabaseConnectionTTCV.getCV();
            tableChucVu.setItems(listCV);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void cancelButtonOnAction()
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
