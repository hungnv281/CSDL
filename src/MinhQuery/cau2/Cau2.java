package MinhQuery.cau2;
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


public class Cau2 implements Initializable {


    @FXML
    private TableView<class2> table2;

    @FXML
    private TableColumn<class2, String> mNVColumn;

    @FXML
    private TableColumn<class2, String> hoTenCoumn;

    @FXML
    private TableColumn<class2, String> ngaySinhColumn;

    @FXML
    private TableColumn<class2, String> queQuanColumn;

    @FXML
    private TableColumn<class2, String> gioiTinhColumn;

    @FXML
    private TableColumn<class2, String> danTocColumn;

    @FXML
    private TableColumn<class2, String> sdtColumn;

    @FXML
    private TableColumn<class2, Date> ngayBDColumn;

    ObservableList<class2> listInf2 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
        mNVColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hoTenCoumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        ngaySinhColumn.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));

        queQuanColumn.setCellValueFactory(new PropertyValueFactory<>("quequan"));

        gioiTinhColumn.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));

        danTocColumn.setCellValueFactory(new PropertyValueFactory<>("dantoc"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdt"));

        ngayBDColumn.setCellValueFactory(new PropertyValueFactory<>("ngaybd"));

        listInf2 = DatabaseConnectionQuery2.getInf2();
        table2.setItems(listInf2);
    }

}
