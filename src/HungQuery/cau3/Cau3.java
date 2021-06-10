package HungQuery.cau3;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.ResourceBundle;

public class Cau3 implements Initializable {

    ObservableList<class3> listInf3 = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listInf3 = DatabaseConnectionQuery3.getInf3();
    }
}
