package HungQuery.cau7;

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

public class Cau7 implements Initializable {
    @FXML
    private TableView<class7> table7;

    @FXML
    private TableColumn<class7, String> mNVColumn;

    @FXML
    private TableColumn<class7, String> hoTenColumn;

    @FXML
    private TableColumn<class7, Date> ngaySinhColumn;

    @FXML
    private TableColumn<class7, String> queQuanColumn;

    @FXML
    private TableColumn<class7, String> gioiTinhColumn;

    @FXML
    private TableColumn<class7, String> danTocColumn;

    @FXML
    private TableColumn<class7, String> sdtColumn;

    @FXML
    private TableColumn<class7, String> maPBColumn;

    @FXML
    private TableColumn<class7, String> maCVColumn;

    @FXML
    private TableColumn<class7, String> maTDHVColumn;

    @FXML
    private TableColumn<class7, String> bacLuongColumn;

    @FXML
    private TableColumn<class7, Date> ngayKTColumn;

    ObservableList<class7> listInf7 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong,loaihd;
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

        ngayKTColumn.setCellValueFactory(new PropertyValueFactory<>("ngaykt"));

        listInf7 = DatabaseConnectionQuery7.getInf7();
        table7.setItems(listInf7);
    }
}
