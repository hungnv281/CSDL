package MinhQuery.cau1;
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
        private TableView<class1> tablePB;

        @FXML
        private TableColumn<class1, String> mpbColumn;

        @FXML
        private TableColumn<class1, String> tenpbColumn;

        @FXML
        private TableColumn<class1, String> sdtColumn;

        @FXML
        private TableColumn<class1, String> diachiColumn;

        @FXML
        private TableColumn<class1, Integer> soLuongColumn;

    ObservableList<class1> listInf1 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mpbColumn.setCellValueFactory(new PropertyValueFactory<>("mapb"));

        tenpbColumn.setCellValueFactory(new PropertyValueFactory<>("tenpb"));

        sdtColumn.setCellValueFactory(new PropertyValueFactory<>("sdtpb"));

        diachiColumn.setCellValueFactory(new PropertyValueFactory<>("diachipb"));

        soLuongColumn.setCellValueFactory(new PropertyValueFactory<>("soluong"));

        listInf1 = DatabaseConnectionQuery1.getInf1();
        tablePB.setItems(listInf1);
    }

}
