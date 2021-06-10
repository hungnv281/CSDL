package TuanAnhQuery.cau1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;


public class Cau1 implements Initializable {

    @FXML
    private TableView<class1> table1;

    @FXML
    private TableColumn<class1, String> mNVColumn;

    @FXML
    private TableColumn<class1, String> hoTenColumn;

    @FXML
    private TableColumn<class1, Date> ngaySinhColumn;

    @FXML
    private TableColumn<class1, String> queQuanColumn;

    @FXML
    private TableColumn<class1, String> gioiTinhColumn;

    @FXML
    private TableColumn<class1, String> danTocColumn;

    @FXML
    private TableColumn<class1, String> sdtColumn;

    @FXML
    private TableColumn<class1, String> maPBColumn;

    @FXML
    private TableColumn<class1, String> maCVColumn;

    @FXML
    private TableColumn<class1, String> maTDHVColumn;

    @FXML
    private TableColumn<class1, String> bacLuongColumn;

    ObservableList<class1> listInf1 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong;
            mNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

            hoTenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

            ngaySinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

            queQuanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

            gioiTinhColumn.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));

            danTocColumn.setCellValueFactory(new PropertyValueFactory<>("dantoc"));

            sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

            maPBColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));

            maCVColumn.setCellValueFactory(new PropertyValueFactory<>("macv"));

            maTDHVColumn.setCellValueFactory(new PropertyValueFactory<>("matdhv"));

            bacLuongColumn.setCellValueFactory(new PropertyValueFactory<>("bacluong"));
        listInf1 = DatabaseConnectionQuery1.getInf1();
        table1.setItems(listInf1);
    }
}
