package BangLuong;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import sample.DatabaseConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class BangLuong implements Initializable {
        @FXML
        private TableView<BL> tableBangLuong;
        @FXML
        private Button addBtn;
        @FXML
        private Button updateBtn;
        @FXML
        private Button deleteBtn;
        @FXML
        private Button cancelButton;
        @FXML
        private TableColumn<BL,String> blColum;
        @FXML
        private TableColumn<BL,Integer> lcbColum;
        @FXML
        private TableColumn<BL,String> hslColum;
        @FXML
        private TableColumn<BL,String > hspcColum;

        @FXML
        private TextField blText;
        @FXML
        private TextField lcbText;
        @FXML
        private TextField hslText;
        @FXML
        private TextField hspcText;

        ObservableList<BL> listBL = FXCollections.observableArrayList();

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            blColum.setCellValueFactory(new PropertyValueFactory<>("bacLuong"));
            lcbColum.setCellValueFactory(new PropertyValueFactory<>("luongCoBan"));
            hslColum.setCellValueFactory(new PropertyValueFactory<>("heSoLuong"));
            hspcColum.setCellValueFactory(new PropertyValueFactory<>("heSoPhuCap"));

            listBL = DatabaseConnectionBL.getBL();
            tableBangLuong.setItems(listBL);
        }
        public void ADD() throws SQLException {
            DatabaseConnectionBL connectionNow = new DatabaseConnectionBL();
            Connection connectDB = connectionNow.ConnectionDb();
            String verify = " INSERT INTO luong(bacluong,luongcb,hsluong,hsphucap) values (?,?,?,?)";
            PreparedStatement preparedStatement = connectDB.prepareStatement(verify);
            try {
                preparedStatement.setString(1,blText.getText());
                preparedStatement.setDouble(2, Double.parseDouble(lcbText.getText()));
                preparedStatement.setDouble(3, Double.parseDouble(hslText.getText()));
                preparedStatement.setDouble(4, Double.parseDouble(hspcText.getText()));
                preparedStatement.execute();
                listBL = DatabaseConnectionBL.getBL();
                tableBangLuong.setItems(listBL);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        int index = -1;
        @FXML
        void getSelectedBL(MouseEvent event){
            index = tableBangLuong.getSelectionModel().getSelectedIndex();
            if(index<-1){
                return;
            }
            blText.setText(blColum.getCellData(index));
            lcbText.setText(String.valueOf(lcbColum.getCellData(index)));
            hslText.setText(String.valueOf(hslColum.getCellData(index)));
            hspcText.setText(String.valueOf(hspcColum.getCellData(index)));
        }
        public  void edit(){
            DatabaseConnection connectionNow = new DatabaseConnection();
            Connection connectDB = connectionNow.ConnectionDb();
            try{
                String value1=blText.getText();
                double value2= Double.parseDouble(lcbText.getText());
                double value3= Double.parseDouble(hslText.getText());
                double value4= Double.parseDouble(hspcText.getText());

                String sql="UPDATE luong SET  bacluong = '"+ value1+"',luongcb = '"
                        +value2+"',hsluong = '"+value3+"',hsphucap ='"+value4+"'WHERE bacluong='"+value1+"'";
                PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
                preparedStatement.execute();
                listBL = DatabaseConnectionBL.getBL();
                tableBangLuong.setItems(listBL);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                e.getCause();
            }

        }
        public void delete(){
            DatabaseConnection connectionNow = new DatabaseConnection();
            Connection connectDB = connectionNow.ConnectionDb();
            try{
                String value1 = blText.getText();
                double value2= Double.parseDouble(lcbText.getText());
                double value3= Double.parseDouble(hslText.getText());
                double value4= Double.parseDouble(hspcText.getText());
                String sql = "DELETE FROM luong WHERE bacluong = '"+value1+"'and luongcb ='"+value2+"' and hsluong = '"+value3+"' and hsphucap='"+value4+"'";
                PreparedStatement preparedStatement = connectDB.prepareStatement(sql);
                preparedStatement.execute();
                listBL = DatabaseConnectionBL.getBL();
                tableBangLuong.setItems(listBL);
            }catch (Exception e)
            {
                e.printStackTrace();
                e.getCause();
            }
        }
     public void cancelButtonOnAction()
     {
         Stage stage = (Stage) cancelButton.getScene().getWindow();
         stage.close();
     }

 }