package NhanVien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.DatabaseConnection;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

import java.sql.Date;
public class DanhSachNhanVien implements Initializable {
    @FXML
    private TableView<NhanVien> tableNhanVien;
    @FXML
    private TableColumn<NhanVien, String> maNVColum;
    @FXML
    private TableColumn<NhanVien, String> nameColum;
    @FXML
    private TableColumn<NhanVien, Date> dobColum;
    @FXML
    private TableColumn<NhanVien, String> addressColum;
    @FXML
    private TableColumn<NhanVien, String> genderColum;
    @FXML
    private TableColumn<NhanVien, String> nationColum;
    @FXML
    private TableColumn<NhanVien, String> phoneNumberColum;
    @FXML
    private TableColumn<NhanVien, String> maPBColum;
    @FXML
    private TableColumn<NhanVien, String> maCVColum;
    @FXML
    private TableColumn<NhanVien, String> maTDHVColum;
    @FXML
    private TableColumn<NhanVien, String> bacLuongColum;
    @FXML
    private Button cancelButton;
    @FXML
    private Button add1;
    @FXML
    private Label label;
    @FXML
    private TextField searchText;
    @FXML
    private TextField maNVText;
    @FXML
    private TextField nameText;
    @FXML
    private TextField dobText;
    @FXML
    private TextField addressText;
    @FXML
    private TextField genderText;
    @FXML
    private TextField nationText;
    @FXML
    private TextField maPBText;
    @FXML
    private TextField maCVText;
    @FXML
    private TextField maTDHVText;
    @FXML
    private TextField bacLuongText;
    @FXML
    private TextField phoneNumberText;

    ObservableList<NhanVien> listNV = FXCollections.observableArrayList();
    ObservableList<NhanVien> dataList = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maNVColum.setCellValueFactory(new PropertyValueFactory<>("maNV"));

        nameColum.setCellValueFactory(new PropertyValueFactory<>("name"));

        dobColum.setCellValueFactory(new PropertyValueFactory<>("dob"));

        addressColum.setCellValueFactory(new PropertyValueFactory<>("address"));

        genderColum.setCellValueFactory(new PropertyValueFactory<>("gender"));

        nationColum.setCellValueFactory(new PropertyValueFactory<>("nation"));

        phoneNumberColum.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));

        maPBColum.setCellValueFactory(new PropertyValueFactory<>("maPB"));

        maCVColum.setCellValueFactory(new PropertyValueFactory<>("maCV"));

        maTDHVColum.setCellValueFactory(new PropertyValueFactory<>("maTDHV"));

        bacLuongColum.setCellValueFactory(new PropertyValueFactory<>("bacLuong"));
        listNV = DatabaseConnection.getDataNhanVien();
        tableNhanVien.setItems(listNV);
       // edit();
        searchUser();

    }
    public void add12()
    {
        ThemThongTinNhanVien();
    }
    @FXML
    void searchUser()
    {
        maNVColum.setCellValueFactory(new PropertyValueFactory<>("maNV"));
        nameColum.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobColum.setCellValueFactory(new PropertyValueFactory<>("dob"));
        addressColum.setCellValueFactory(new PropertyValueFactory<>("address"));
        genderColum.setCellValueFactory(new PropertyValueFactory<>("gender"));
        nationColum.setCellValueFactory(new PropertyValueFactory<>("nation"));
        phoneNumberColum.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        maPBColum.setCellValueFactory(new PropertyValueFactory<>("maPB"));
        maCVColum.setCellValueFactory(new PropertyValueFactory<>("maCV"));
        maTDHVColum.setCellValueFactory(new PropertyValueFactory<>("maTDHV"));
        bacLuongColum.setCellValueFactory(new PropertyValueFactory<>("bacLuong"));
        dataList = DatabaseConnection.getDataNhanVien();
        tableNhanVien.setItems(dataList);
        FilteredList<NhanVien> filteredData = new FilteredList<>(dataList, b -> true);
        //maNV,name,dob,address,gender,nation,phonenumber,maPB,maCV,maTDHV,bacLuong;

        searchText.textProperty().addListener((observable, oldValue, newValue) -> filteredData.setPredicate(person -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();

            if (person.getMaNV().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getName().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getDob().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getAddress().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getGender().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getNation().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getPhonenumber().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
            if (person.getMaPB().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            } else
                if (person.getMaCV().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else
                if (person.getMaTDHV().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }else
                return person.getBacLuong().toLowerCase().contains(lowerCaseFilter);
        }));
        SortedList<NhanVien> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tableNhanVien.comparatorProperty());
        tableNhanVien.setItems(sortedData);
    }

    public void ThemThongTinNhanVien()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/NhanVien/ThemThongTinNhanVien.fxml"));
            Stage ThongTinNhanVienStage=new Stage();
            ThongTinNhanVienStage.setTitle("Danh cho nguoi Quan Li");
            ThongTinNhanVienStage.setScene(new Scene(root, 1280, 700));
            ThongTinNhanVienStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    int index=-1;
    @FXML
    void getSelected (MouseEvent event)
    {
        index=tableNhanVien.getSelectionModel().getSelectedIndex();
        if(index<-1) {
            return;
        }
        maNVText.setText(maNVColum.getCellData(index));
        nameText.setText(nameColum.getCellData(index));
        dobText.setText(String.valueOf(dobColum.getCellData(index)));
        addressText.setText(addressColum.getCellData(index));
        genderText.setText(genderColum.getCellData(index));
        nationText.setText(nationColum.getCellData(index));
        phoneNumberText.setText(phoneNumberColum.getCellData(index));
        maPBText.setText(maPBColum.getCellData(index));
        maCVText.setText(maCVColum.getCellData(index));
        maTDHVText.setText(maTDHVColum.getCellData(index));
        bacLuongText.setText(bacLuongColum.getCellData(index));
    }
    public void edit()
    {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maNVText.getText();
            String value2=nameText.getText();
            String value3=dobText.getText();
            String value4=addressText.getText();
            String value5=genderText.getText();
            String value6=nationText.getText();
            String value7=phoneNumberText.getText();
            String value8=maPBText.getText();
            String value9=maCVText.getText();
            String value10=maTDHVText.getText();
            String value11=bacLuongText.getText();

            String sql="UPDATE nhanvien SET hoten='"+value2+"',ngaysinh='"+value3+
                    "',quequan='"+ value4+"',gioitinh='"+value5+"',dantoc='"+value6+"',sdt='"+value7+"',mapb='"+
                    value8+"',macv='"+value9+"',matdhv='"+ value10+"',bacluong='"+value11+"' WHERE manv= '"+value1+"'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listNV = DatabaseConnection.getDataNhanVien();
            tableNhanVien.setItems(listNV);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void delete()
    {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.ConnectionDb();
        try
        {
            String value1=maNVText.getText();

            String sql="DELETE FROM nhanvien WHERE manv= '"+value1+ "'";
            PreparedStatement preparedStatement= connectDB.prepareStatement(sql);
            preparedStatement.execute();
            listNV = DatabaseConnection.getDataNhanVien();
            tableNhanVien.setItems(listNV);
        }
        catch (Exception e)
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




