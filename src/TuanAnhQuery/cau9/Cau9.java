package TuanAnhQuery.cau9;
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

public class Cau9 implements Initializable {
    @FXML
    private TableView<class9> table9;

    @FXML
    private TableColumn<class9, String> mNVColumn;

    @FXML
    private TableColumn<class9, String> hoTenColumn;

    @FXML
    private TableColumn<class9, Date> ngaySinhColumn;

    @FXML
    private TableColumn<class9, String> queQuanColumn;

    @FXML
    private TableColumn<class9, String> gioiTinhColumn;

    @FXML
    private TableColumn<class9, String> danTocColumn;

    @FXML
    private TableColumn<class9, String> sdtColumn;

    @FXML
    private TableColumn<class9, String> maPBColumn;

    @FXML
    private TableColumn<class9, String> maCVColumn;

    @FXML
    private TableColumn<class9, String> maTDHVColumn;

    @FXML
    private TableColumn<class9, String> bacLuongColumn;

    @FXML
    private TableColumn<class9, Date> ngayKTColumn;

    ObservableList<class9> listInf9 = FXCollections.observableArrayList();
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

        listInf9 = DatabaseConnectionQuery9.getInf9();
        table9.setItems(listInf9);
    }
}
