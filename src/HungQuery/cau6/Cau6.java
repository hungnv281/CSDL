package HungQuery.cau6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Cau6 implements Initializable {
    ObservableList<class6> listInf6 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listInf6= DatabaseConnectionQuery6.getInf6();
    }
}
