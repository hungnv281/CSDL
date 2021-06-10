package TuanAnhQuery.cau5;
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

public class Cau5 implements Initializable {
    @FXML
    private TableView<class5> table5;

    @FXML
    private TableColumn<class5, String> mNVColumn;

    @FXML
    private TableColumn<class5, String> hoTenColumn;

    @FXML
    private TableColumn<class5, Date> ngaySinhColumn;

    @FXML
    private TableColumn<class5, String> queQuanColumn;

    @FXML
    private TableColumn<class5, String> sdtColumn;

    @FXML
    private TableColumn<class5, String> tenTDHVColumn;

    ObservableList<class5> listInf5 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong,loaihd;
        mNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hoTenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaySinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        queQuanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        tenTDHVColumn.setCellValueFactory(new PropertyValueFactory<>("tentdhv"));

        listInf5 = DatabaseConnectionQuery5.getInf5();
        table5.setItems(listInf5);
    }
}
