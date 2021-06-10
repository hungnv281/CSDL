package MinhQuery.cau5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau5 implements Initializable {
    @FXML
    private TableView<class5> tableTL;

    @FXML
    private TableColumn<class5, String> mnvColumn;

    @FXML
    private TableColumn<class5, String> hotenColumn;

    @FXML
    private TableColumn<class5, String> ngaysinhColumn;

    @FXML
    private TableColumn<class5, String> quequanColumn;

    @FXML
    private TableColumn<class5, String> sdtColumn;

    @FXML
    private TableColumn<class5, Double> tienluongColumn;

    ObservableList<class5> listInf5 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        mnvColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaysinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        quequanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        tienluongColumn.setCellValueFactory(new PropertyValueFactory<>("tienluong"));

        listInf5 = DatabaseConnectionQuery5.getInf5();
        tableTL.setItems(listInf5);
    }
}
