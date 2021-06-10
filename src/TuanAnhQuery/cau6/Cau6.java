package TuanAnhQuery.cau6;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;

public class Cau6 implements Initializable {

    @FXML
    private TableView<class6> table6;

    @FXML
    private TableColumn<class6, String> blColum;

    @FXML
    private TableColumn<class6, Double> lcbColum;

    @FXML
    private TableColumn<class6, Double> hslColum;

    @FXML
    private TableColumn<class6, Double> hspcColum;


    ObservableList<class6> listInf6 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listInf6 = DatabaseConnectionQuery6.getInf6();

    }
}
