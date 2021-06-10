package TrinhDoNhanVien;

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
import sample.DatabaseConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static TrinhDoNhanVien.DatabaseConnectionTDNV.getTDNV;

public class TrinhDoNhanVien implements Initializable {
    @FXML
    private Button addBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private Button updateBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private TableView<TDNV> tableTDNV;
    @FXML
    private TableColumn<TDNV,String> mtdhvColum;
    @FXML
    private TableColumn<TDNV,String> tdhvColum;
    @FXML
    private TableColumn<TDNV,String> cnColum;
    @FXML
    private TextField maTDHVText;
    @FXML
    private TextField TDHVText;
    @FXML
    private TextField CNText;

    ObservableList<TDNV> listTDNV = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //string la ten bien dat trong TDNV
        mtdhvColum.setCellValueFactory(new PropertyValueFactory<>("maTDHV"));
        tdhvColum.setCellValueFactory(new PropertyValueFactory<>("nameTDHV"));
        cnColum.setCellValueFactory(new PropertyValueFactory<>("chuyenNganh"));
        listTDNV = getTDNV();
        tableTDNV.setItems(listTDNV);
    }
    public void addTDHV() throws SQLException {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        String verify = " INSERT INTO trinhdohocvan(matdhv, tentdhv, cnganh) values(?,?,?)";
        PreparedStatement preparedStatement = connectDB.prepareStatement(verify);
        try
        {
            preparedStatement.setString(1,maTDHVText.getText());
            preparedStatement.setString(2,TDHVText.getText());
            preparedStatement.setString(3,CNText.getText());
            preparedStatement.execute();
            listTDNV = getTDNV();
            tableTDNV.setItems(listTDNV);

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    int indexTDNV=-1;
    @FXML
    void getSelectedTDNV (MouseEvent event)
    {
        indexTDNV=tableTDNV.getSelectionModel().getSelectedIndex();
        if(indexTDNV<-1) {
            return;
        }
        maTDHVText.setText(mtdhvColum.getCellData(indexTDNV));
        TDHVText.setText(tdhvColum.getCellData(indexTDNV));
        CNText.setText(cnColum.getCellData(indexTDNV));
    }
    public void edit()
    {
        DatabaseConnectionTDNV connectionNow = new DatabaseConnectionTDNV();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maTDHVText.getText();
            String value2=TDHVText.getText();
            String value3=CNText.getText();


           String sql="UPDATE trinhdohocvan SET matdhv='"+value1+"',tentdhv='"+value2+
                    "',cnganh='"+ value3+"' WHERE matdhv= '"+value1+"'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listTDNV = getTDNV();
            tableTDNV.setItems(listTDNV);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void delete()
    {
        DatabaseConnectionTDNV connectionNow = new DatabaseConnectionTDNV();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maTDHVText.getText();
            String sql="DELETE FROM trinhdohocvan WHERE matdhv= '"+value1+ "'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listTDNV = getTDNV();
            tableTDNV.setItems(listTDNV);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void cancelButtonOnAction()
    {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

}
