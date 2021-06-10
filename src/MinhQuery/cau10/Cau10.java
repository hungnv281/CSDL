package MinhQuery.cau10;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau10 implements Initializable {
    @FXML
    private TableView<class10> table10;
    @FXML
    private TableColumn<class10, String> maNVColumn;

    @FXML
    private TableColumn<class10, String> hotenColumn;

    @FXML
    private TableColumn<class10, String> maCVColumn;

    @FXML
    private TableColumn<class10, String> tenCVColumn;

    ObservableList<class10> listInf10 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        maNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        maCVColumn.setCellValueFactory(new PropertyValueFactory<>("macv"));

        tenCVColumn.setCellValueFactory(new PropertyValueFactory<>("tencv"));

        listInf10 = DatabaseConnectionQuery10.getInf10();
        table10.setItems(listInf10);
    }
}
