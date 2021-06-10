package MinhQuery.cau9;
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
    private TableColumn<class9, String> mnvColumn;

    @FXML
    private TableColumn<class9, String> hotenColumn;

    @FXML
    private TableColumn<class9, String> sdtColumn;

    @FXML
    private TableColumn<class9, String> tenCVColumn;

    @FXML
    private TableColumn<class9, String> tenPBColumn;

    @FXML
    private TableColumn<class9, Date> ngayBDColumn;

    @FXML
    private TableColumn<class9, Float> thoiGianColumn;
    ObservableList<class9> listInf9 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        mnvColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        tenCVColumn.setCellValueFactory(new PropertyValueFactory<>("tencv"));

        tenPBColumn.setCellValueFactory(new PropertyValueFactory<>("tenpb"));

        ngayBDColumn.setCellValueFactory(new PropertyValueFactory<>("ngaybd"));

        thoiGianColumn.setCellValueFactory(new PropertyValueFactory<>("thoigian"));

        listInf9 = DatabaseConnectionQuery9.getInf9();
        table9.setItems(listInf9);
    }
}

