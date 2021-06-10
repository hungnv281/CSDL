package HungQuery.cau1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau1 implements Initializable {
    @FXML
    private TableView<class1> table1;

    @FXML
    private TableColumn<class1, String> manvColumn;

    @FXML
    private TableColumn<class1, String> hotenColumn;

    @FXML
    private TableColumn<class1, String> maPBColumn;

    ObservableList<class1> listInf1 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mapb,number_male, number_female;
        manvColumn.setCellValueFactory(new PropertyValueFactory<>("manv"));

        hotenColumn.setCellValueFactory(new PropertyValueFactory<>("hoten"));

        maPBColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));

        listInf1 = DatabaseConnectionQuery1.getInf1();
        table1.setItems(listInf1);
    }
}
