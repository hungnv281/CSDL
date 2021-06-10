package ThangTien;

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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ThangTien implements Initializable {
    @FXML
    private TableView<TT> tableTT;

    @FXML
    private TableColumn<TT, String> maNVColumn;

    @FXML
    private TableColumn<TT, String> maCVColumn;

    @FXML
    private TableColumn<TT, String> maPBColumn;

    @FXML
    private TableColumn<TT, Date> ngayTTColumn;

    @FXML
    private TableColumn<TT, Date> ngayKTColumn;

    @FXML
    private TextField maNVText;

    @FXML
    private TextField maCVText;

    @FXML
    private TextField maPBText;

    @FXML
    private TextField ngayTTText;

    @FXML
    private TextField ngayKTText;

    @FXML
    private Button addButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button cancelButton;

    ObservableList<TT> listTT = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));
        maCVColumn.setCellValueFactory(new PropertyValueFactory<>("macv"));
        maPBColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));
        ngayTTColumn.setCellValueFactory(new PropertyValueFactory<>("ngaytiepnhan"));
        ngayKTColumn.setCellValueFactory(new PropertyValueFactory<>("ngayketthuc"));

        listTT = DatabaseConnectionTT.getTT();
        tableTT.setItems(listTT);
    }

    public void ADD() throws SQLException {
        DatabaseConnectionTT connectionNow = new DatabaseConnectionTT();
        Connection connectDB = connectionNow.ConnectionDb();
        String verify = " INSERT INTO thangtien(manv, macv, mapb, ngaytiepnhan, ngayketthuc) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connectDB.prepareStatement(verify);
        try {
            preparedStatement.setString(1, maNVText.getText());
            preparedStatement.setString(2, maCVText.getText());
            preparedStatement.setString(3, maPBText.getText());
            preparedStatement.setDate(4, Date.valueOf(ngayTTText.getText()));
            preparedStatement.setDate(4, Date.valueOf(ngayKTText.getText()));
            preparedStatement.execute();
            listTT = DatabaseConnectionTT.getTT();
            tableTT.setItems(listTT);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    int index = -1;

    @FXML
    void getSelectedTT(MouseEvent event) {
        index = tableTT.getSelectionModel().getSelectedIndex();
        if (index < -1) {
            return;
        }
        maNVText.setText(maNVColumn.getCellData(index));
        maCVText.setText(String.valueOf(maCVColumn.getCellData(index)));
        maPBText.setText(String.valueOf(maPBColumn.getCellData(index)));
        ngayTTText.setText(String.valueOf(ngayTTColumn.getCellData(index)));
        ngayKTText.setText(String.valueOf(ngayKTColumn.getCellData(index)));
    }
    public  void edit(){
        DatabaseConnectionTT connectionNow = new DatabaseConnectionTT();
        Connection connectDB = connectionNow.ConnectionDb();
        try{
            String value1=maNVText.getText();
            String value2= maCVText.getText();
            String value3= maPBText.getText();
            Date value4= Date.valueOf(ngayTTText.getText());
            Date value5= Date.valueOf(ngayKTText.getText());
            String sql="UPDATE thangtien SET  macv = '" +value2+"',mapb = '"+value3+
                    "',ngaytiepnhan ='"+value4+"',ngayketthuc ='"+value5+"'WHERE manv='"+value1+"'";
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listTT = DatabaseConnectionTT.getTT();
            tableTT.setItems(listTT);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void delete(){
        DatabaseConnectionTT connectionNow = new DatabaseConnectionTT();
        Connection connectDB = connectionNow.ConnectionDb();
        try{
            String value1 = maNVText.getText();
            String value2 = maCVText.getText();
            String value3 = maPBText.getText();
            Date value4 = Date.valueOf(ngayTTText.getText());
            Date value5 = Date.valueOf(ngayKTText.getText());
            String sql = "DELETE FROM thangtien WHERE manv = '"+value1+"' and macv = '" +value2+"' and mapb = '"+value3+"' and ngaytiepnhan ='"+value4+"' and ngayketthuc = '"+value5+"'";
            PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listTT = DatabaseConnectionTT.getTT();
            tableTT.setItems(listTT);
        }catch (Exception e)
        {
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

