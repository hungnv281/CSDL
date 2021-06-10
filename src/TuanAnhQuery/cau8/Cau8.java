package TuanAnhQuery.cau8;
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
public class Cau8 implements Initializable {
    @FXML
    private TableView<class8> table8;

    @FXML
    private TableColumn<class8, String> mnvColumn;

    @FXML
    private TableColumn<class8, String> hotenColumn;

    @FXML
    private TableColumn<class8, Date> ngaysinhColumn;

    @FXML
    private TableColumn<class8, String> quequanColumn;

    @FXML
    private TableColumn<class8, String> sdtColumn;

    @FXML
    private TableColumn<class8, String> bacluongColumn;

    ObservableList<class8> listInf8 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        mnvColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaysinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        quequanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        bacluongColumn.setCellValueFactory(new PropertyValueFactory<>("bacluong"));

        listInf8 = DatabaseConnectionQuery8.getInf8();
        table8.setItems(listInf8);
    }
}
