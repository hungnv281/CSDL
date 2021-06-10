package MinhQuery.cau3;

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
    private TableColumn<class3, String> cNganhColumn;

    @FXML
    private TableColumn<class3, Integer> numberColumn;


    ObservableList<class3> listInf3 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cNganhColumn.setCellValueFactory(new PropertyValueFactory<>("cnganh"));

        numberColumn.setCellValueFactory(new PropertyValueFactory<>("soluong"));

        listInf3 = DatabaseConnectionQuery3.getInf3();
        table3.setItems(listInf3);
    }

}
