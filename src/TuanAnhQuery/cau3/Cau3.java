package TuanAnhQuery.cau3;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau3 implements Initializable {
    @FXML
    private TableView<class3> table3;

    @FXML
    private TableColumn<class3, String> hoTenColumn;

    @FXML
    private TableColumn<class3, String> tenCVColumn;

    @FXML
    private TableColumn<class3, String> tenPBColumn;


    ObservableList<class3> listInf3 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hoTenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        tenCVColumn.setCellValueFactory(new PropertyValueFactory<>("tenCV"));

        tenPBColumn.setCellValueFactory(new PropertyValueFactory<>("tenPB"));

        listInf3 = DatabaseConnectionQuery3.getInf3();
        table3.setItems(listInf3);
    }
}
