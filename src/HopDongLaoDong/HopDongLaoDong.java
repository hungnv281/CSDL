package HopDongLaoDong;

import static HopDongLaoDong.DatabaseConnectionHDLD.getHDLD;

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
import java.util.Date;
import java.util.ResourceBundle;

public class HopDongLaoDong implements Initializable {
    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button updateBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private TableView<HDLD> tableHDLD;
    @FXML
    private TableColumn<HDLD,String> mhdColum;
    @FXML
    private TableColumn<HDLD,String> mnvColum;
    @FXML
    private TableColumn<HDLD,String>  lhdColum;
    @FXML
    private TableColumn<HDLD, Date> nbdColum;
    @FXML
    private TableColumn<HDLD, Date>  nktColum;
    @FXML
    private TextField maHDText;
    @FXML
    private TextField maNVText;
    @FXML
    private TextField loaiHDText;
    @FXML
    private TextField ngayBDDate;
    @FXML
    private TextField ngayKTDate;

    ObservableList<HDLD> listHDLD = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //string la ten bien dat trong TDNV
        mhdColum.setCellValueFactory(new PropertyValueFactory<>("maHD"));
        mnvColum.setCellValueFactory(new PropertyValueFactory<>("maNV"));
        lhdColum.setCellValueFactory(new PropertyValueFactory<>("loaiHD"));
        nbdColum.setCellValueFactory(new PropertyValueFactory<>("ngayBD"));
        nktColum.setCellValueFactory(new PropertyValueFactory<>("ngayKT"));
        listHDLD = getHDLD();
        tableHDLD.setItems(listHDLD);
    }
      /*  public void addHDLD() throws SQLException {
        DatabaseConnectionHDLD connectionNow = new DatabaseConnectionHDLD();
        Connection connectDB = connectionNow.ConnectionDb();
        String verify = " INSERT INTO hopdonglaodong(mahd, manv, loaihd, ngaybd, ngaykt) " +
                "values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connectDB.prepareStatement(verify);
        try
        {
            preparedStatement.setString(1,maHDText.getText());
            preparedStatement.setString(2,maNVText.getText());
            preparedStatement.setString(3,loaiHDText.getText());
            preparedStatement.setDate(4, java.sql.Date.valueOf((ngayBDDate.getText())));
            preparedStatement.setDate(5,(java.sql.Date.valueOf(ngayKTDate.getText())));
            preparedStatement.execute();
            listHDLD = getHDLD();
            tableHDLD.setItems(listHDLD);

        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    int indexHDLD=-1;
    @FXML
    void getSelectedHDLD (MouseEvent event)
    {
        indexHDLD=tableHDLD.getSelectionModel().getSelectedIndex();
        if(indexHDLD<-1) {
            return;
        }
        maHDText.setText(mhdColum.getCellData(indexHDLD));
        maNVText.setText(mnvColum.getCellData(indexHDLD));
        loaiHDText.setText(lhdColum.getCellData(indexHDLD));
        ngayBDDate.setText(String.valueOf(nbdColum.getCellData(indexHDLD)));
        ngayKTDate.setText(String.valueOf(nktColum.getCellData(indexHDLD)));
    }*/
    public void edit()
    {
        DatabaseConnectionHDLD connectionNow = new DatabaseConnectionHDLD();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maHDText.getText();
            String value2=maNVText.getText();
            String value3=loaiHDText.getText();
            String value4=ngayBDDate.getText();
            String value5=ngayKTDate.getText();


            String sql="UPDATE hopdonglaodong SET mahd='"+value1+"',manv='"+value2+
                    "', loaihd='"+ value3+"',ngaybd='"+value4+"',ngaykt='"+value5+
                    "'WHERE mahd= '"+value1+"'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listHDLD = getHDLD();
            tableHDLD.setItems(listHDLD);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void delete()
    {
        DatabaseConnectionHDLD connectionNow = new DatabaseConnectionHDLD();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maHDText.getText();
            String sql="DELETE FROM hopdonglaodong WHERE mahd= '"+value1+ "'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listHDLD = getHDLD();
            tableHDLD.setItems(listHDLD);
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
