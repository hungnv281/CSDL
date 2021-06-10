package HungQuery.cau2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau2 implements Initializable {
    @FXML
    private TableView<class2> table2;

    @FXML
    private TableColumn<class2, String> mpbColumn;

    @FXML
    private TableColumn<class2, Integer> maleColumn;

    @FXML
    private TableColumn<class2, Integer> femaleColumn;

    ObservableList<class2> listInf2 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mapb,number_male, number_female;
        mpbColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));

        maleColumn.setCellValueFactory(new PropertyValueFactory<>("number_employees_male"));

        femaleColumn.setCellValueFactory(new PropertyValueFactory<>("number_employees_female"));

        listInf2 = DatabaseConnectionQuery2.getInf2();
        table2.setItems(listInf2);
    }
}
