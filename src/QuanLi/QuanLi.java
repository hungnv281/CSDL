package QuanLi;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class QuanLi implements Initializable{
    @FXML
    private Text message;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TreeTableView<String> tableView;

    @FXML
    private TreeTableColumn<String,String> column1;

    @FXML
    private ComboBox<String> minhCbb;

    @FXML
    private ComboBox<String> hungCbb;

    @FXML
    private ComboBox<String> taCbb;

    @FXML
    private Button cancelButton;

    @FXML
    private Text timKiemNhanh;
    ObservableList<String > list = FXCollections.observableArrayList(
            "Danh sach nhan vien",
            "Trinh Do Nhan Vien",
            "Thong tin chuc vu",
            "Bang Luong","Hop Dong lao Dong",
            "Thang Tien");
    ObservableList<String > list1 = FXCollections.observableArrayList(
            "câu 1","câu 2","câu 3","câu 4","câu 5","câu 6","câu 7","câu 8","câu 9","câu 10");
    ObservableList<String > list2 = FXCollections.observableArrayList(
            "câu 1","câu 2","câu 3","câu 4","câu 5","câu 6","câu 7","câu 8","câu 9","câu 10");
    ObservableList<String > list3 = FXCollections.observableArrayList(
            "câu 1","câu 2","câu 3","câu 4","câu 5","câu 6","câu 7","câu 8","câu 9","câu 10");


    TreeItem<String> root =new TreeItem<>("Cac cau query kiem tra ");

    TreeItem<String> parent1 =new TreeItem<>("Minh query");
    TreeItem<String> item1 =new TreeItem<>("1. Thông tin số lượng nhân viên của mỗi phòng ban");
    TreeItem<String> item2 =new TreeItem<>("2. Thông tin các nhân viên kí hợp đồng trong năm 2020");
    TreeItem<String> item3 =new TreeItem<>("3. Cho biết 2 chuyên ngành chiếm đa số trong công ty và có bao nhiêu người");
    TreeItem<String> item4 =new TreeItem<>("4. Thông tin các nhân viên được thăng chức trong vòng 1 năm trở lại đây");
    TreeItem<String> item5 =new TreeItem<>("5. Thông tin những nhân viên có tiền lương tháng lớn hơn 35 triệu (không tính tiền phụ cấp)");
    TreeItem<String> item6 =new TreeItem<>("6. Thông tin các nhân viên Nam có trình độ tốt nghiệp đại học chuyên ngành marketing");
    TreeItem<String> item7 =new TreeItem<>("7. Cho biết chức vụ,phòng ban của các nhân viên có trình độ đại học có quê ở vĩnh phúc hoặc hà nội hoặc quảng ninh");
    TreeItem<String> item8 =new TreeItem<>("8. Lấy ra thông tin về các chức vụ mà nhân viên có mã số 20184150 đã và đang nắm giữ cho đến hiện tại");
    TreeItem<String> item9 =new TreeItem<>("9. Liệt kê 10 nhân viên làm việc lâu nhất mà chưa được thăng chức lần nào");
    TreeItem<String> item10 =new TreeItem<>("10. Liệt kê những người đã từng và đang nắm giữ chức vụ manager của các phòng ban.");

    TreeItem<String> parent2 =new TreeItem<>("Hung query");
    TreeItem<String> item11 =new TreeItem<>("1. Lấy ngẫu nhiên 10 nhân viên để tham gia hoạt động Tết của công ti");
    TreeItem<String> item12 =new TreeItem<>("2. Cho biết phòng ban nào có số lượng nam lơn hơn số lượng nữ.");
    TreeItem<String> item13 =new TreeItem<>("3. nhân viên 20184108 có trình độ học vấn trung cấp chuyên ngành kinh tế, sau khi được công ti đào tạo tại\n" +
            " nước ngoài đã có trình độ tương đương đại học , cập nhật trình độ học vấn trong bảng nhân viên và đồng thời tăng lương lên bậc xứng đáng");
    TreeItem<String> item14 =new TreeItem<>("4. Chuyển nhân viên 20184133 sang phòng sản xuất");
    TreeItem<String> item15 =new TreeItem<>("5. Công ty muốn trao một số món quà đặc biệt cho những nhân viên may mắn nếu có ngày sinh trùng với 2 số cuối của số điện thoại.");
    TreeItem<String> item16 =new TreeItem<>("6. Nhân viên 20184144 có kết quả làm việc tốt ,thăng chức");
    TreeItem<String> item17 =new TreeItem<>("7. Tìm kiếm nhân viên sắp hết hạn hợp đồng : còn nhỏ hơn hoặc bằng 3 tháng");
    TreeItem<String> item18 =new TreeItem<>("8. Tìm kiếm những nhân viên có tham gia >= 2 phòng ban ");
    TreeItem<String> item19 =new TreeItem<>("9. Để cổ vũ tinh thần , tìm ra các nhân viên có ngày sinh trong tháng hiện tại để có quà vào cuối tháng");
    TreeItem<String> item20 =new TreeItem<>("10. Đưa ra nhân viên nam có quê quán 'vĩnh phúc' , tên có chứa 'vũ' thuộc phòng 'Kế Toán'");

    TreeItem<String> parent3 =new TreeItem<>("Tuan Anh query");
    TreeItem<String> item21 =new TreeItem<>("1. In danh sách nhân viên có quê quán ở quảng ninh.");
    TreeItem<String> item22 =new TreeItem<>("2. In danh sách nhân viên có hợp đồng thời hạn với công ty ");
    TreeItem<String> item23 =new TreeItem<>("3. In danh sách gồm tên nhân viên chức vụ và phòng ban của họ trong công ty  ");
    TreeItem<String> item24 =new TreeItem<>("4. Vì sử dụng chất kích thích tại công ty nên nhân viên ‘phạm diễm quỳnh’ bị đuổi hãy xóa mọi thông tin về nhân viên này");
    TreeItem<String> item25 =new TreeItem<>("5. Liệt kê nhân viên có trình độ học vấn ‘đại học’ trong công ty");
    TreeItem<String> item26 =new TreeItem<>("6. Do covid-19 công ty giảm 10% lương cơ bản của tất cả nhân viên hay update thông tin này");
    TreeItem<String> item27 =new TreeItem<>("7. Danh sách nhân viên nữ thuộc phòng kế toán của công ty");
    TreeItem<String> item28 =new TreeItem<>("8. Đưa gia danh sách 5 người trẻ tuổi có mức lương cao nhất công ty");
    TreeItem<String> item29 =new TreeItem<>("9. Danh sách những học viên sẽ hết hạn hợp đồng với công ty trước tháng 12/2021");
    TreeItem<String> item30 =new TreeItem<>("10.Đưa ra danh sách những nhân viên gia nhập công ty vào cùng ngày 2017-12-28.");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(list);
        minhCbb.setItems(list1);
        hungCbb.setItems(list2);
        taCbb.setItems(list3);
        parent1.getChildren().setAll(item1,item2,item3,item4,item5,item6,item7,item8,item9,item10);
        parent2.getChildren().setAll(item11,item12,item13,item14,item15,item16,item17,item18,item19,item20);
        parent3.getChildren().setAll(item21,item22,item23,item24,item25,item26,item27,item28,item29,item30);
        root.getChildren().setAll(parent1,parent2,parent3);
        column1.setCellValueFactory(stringStringCellDataFeatures -> new SimpleStringProperty(stringStringCellDataFeatures.getValue().getValue()));
        tableView.setRoot(root);
    }
    public void alert1 ()
    {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Alert");
        alert.setContentText("THÀNH CÔNG");
        alert.setHeaderText(null);
        alert.show();
        ButtonType buttonTypeYes  = new ButtonType("OK", ButtonBar.ButtonData.YES);

        alert.getButtonTypes().setAll(buttonTypeYes);

    }
    //int index=-1;
    public void clickButtonOnAction2()
    {
        //-----HUNG QUERY
        switch (hungCbb.getValue()) {
            case "câu 1" -> query11Form();
            case "câu 2" -> query12Form();
            case "câu 3" -> {
                query13Form();
                alert1();
            }
            case "câu 4" -> {
                query14Form();
                alert1();
            }
            case "câu 5" -> query15Form();
            case "câu 6" -> {
                query16Form();
                alert1();
            }
            case "câu 7" -> query17Form();
            case "câu 8" -> query18Form();
            case "câu 9" -> query19Form();
            case "câu 10" -> query20Form();
        }
    }
    public void clickButtonOnAction3()
    {
        //--TUAN ANH QUERY
        switch (taCbb.getValue()) {
            case "câu 1" -> query21Form();
            case "câu 2" -> query22Form();
            case "câu 3" -> query23Form();
            case "câu 4" -> {
                query24Form();
                alert1();
            }
            case "câu 5" -> query25Form();
            case "câu 6" -> {
                query26Form();
                alert1();
            }
            case "câu 7" -> query27Form();
            case "câu 8" -> query28Form();
            case "câu 9" -> query29Form();
            case "câu 10" -> query30Form();
        }
    }
    public void clickButtonOnAction1()
    {
        //--MIMH QUERY
        switch (minhCbb.getValue()) {
            case "câu 1" -> query1Form();
            case "câu 2" -> query2Form();
            case "câu 3" -> query3Form();
            case "câu 4" -> query4Form();
            case "câu 5" -> query5Form();
            case "câu 6" -> query6Form();
            case "câu 7" -> query7Form();
            case "câu 8" -> query8Form();
            case "câu 9" -> query9Form();
            case "câu 10" -> query10Form();
        }


    }
    public void comboBoxChange()
    {
        timKiemNhanh.setText(comboBox.getValue());
    }

    public void findButtonOnAction()
    {
        if(comboBox.getValue()==null)
        {
            message.setText("You have not selected a function");
        }
        else {
            if(comboBox.getValue().equals("Danh sach nhan vien"))
                DanhSachNhanVienForm();
            if(comboBox.getValue().equals("Trinh Do Nhan Vien"))
                TrinhDoNhanVienForm();
            if(comboBox.getValue().equals("Thong tin chuc vu"))
                ThongTinChucVuForm();
            if(comboBox.getValue().equals("Hop Dong lao Dong"))
                HopDongLaoDongForm();
            if(comboBox.getValue().equals("Bang Luong"))
                BangluongForm();
            if(comboBox.getValue().equals("Thang Tien"))
                ThangTienForm();
        }
    }
    public void cancelButtonOnAction()
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void DanhSachNhanVienForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/NhanVien/DanhSachNhanVien.fxml"));
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
    public void ThongTinChucVuForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/ThongTinChucVu/ThongTinChucVu.fxml"));
            Stage ThongTinChucVuStage=new Stage();
            ThongTinChucVuStage.setTitle("Danh cho nguoi Quan Li");
            ThongTinChucVuStage.setScene(new Scene(root, 1280, 700));
            ThongTinChucVuStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void TrinhDoNhanVienForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TrinhDoNhanVien/TrinhDoNhanVien.fxml"));
            Stage ThongTinChucVuStage=new Stage();
            ThongTinChucVuStage.setTitle("Danh cho nguoi Quan Li");
            ThongTinChucVuStage.setScene(new Scene(root, 1280, 700));
            ThongTinChucVuStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void HopDongLaoDongForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HopDongLaoDong/HopDongLaoDong.fxml"));
            Stage HopDongLaoDongStage=new Stage();
            HopDongLaoDongStage.setTitle("Danh cho nguoi Quan Li");
            HopDongLaoDongStage.setScene(new Scene(root, 1280, 700));
            HopDongLaoDongStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void BangluongForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/BangLuong/BangLuong.fxml"));
            Stage BangluongStage=new Stage();
            BangluongStage.setTitle("Danh cho nguoi Quan Li");
            BangluongStage.setScene((new Scene(root,1280,700)));
            BangluongStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void ThangTienForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/ThangTien/ThangTien.fxml"));
            Stage ThangTienStage=new Stage();
            ThangTienStage.setTitle("Danh cho nguoi Quan Li");
            ThangTienStage.setScene((new Scene(root,1280,700)));
            ThangTienStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query1Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau1/Cau1.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query2Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau2/Cau2.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    } public void query3Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau3/Cau3.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query4Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau4/Cau4.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query5Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau5/Cau5.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query6Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau6/Cau6.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
     public void query7Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau7/Cau7.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query8Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau8/Cau8.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query9Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau9/Cau9.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query10Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/MinhQuery/cau10/Cau10.fxml"));
            Stage MinhQueryStage=new Stage();
            MinhQueryStage.setTitle("Danh cho nguoi Quan Li");
            MinhQueryStage.setScene(new Scene(root, 1280, 700));
            MinhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query11Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau1/Cau1.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query12Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau2/Cau2.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query13Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau3/Cau3.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query14Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau4/Cau4.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query15Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau5/Cau5.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query16Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau6/Cau6.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query17Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau7/Cau7.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query18Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau8/Cau8.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query19Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau9/Cau9.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query20Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/HungQuery/cau10/Cau10.fxml"));
            Stage HungQueryStage=new Stage();
            HungQueryStage.setTitle("Danh cho nguoi Quan Li");
            HungQueryStage.setScene(new Scene(root, 1280, 700));
            HungQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query21Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau1/Cau1.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query22Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau2/Cau2.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query23Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau3/Cau3.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query24Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau4/Cau4.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query25Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau5/Cau5.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query26Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau6/Cau6.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query27Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau7/Cau7.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query28Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau8/Cau8.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query29Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau9/Cau9.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void query30Form()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/TuanAnhQuery/cau10/Cau10.fxml"));
            Stage TuanAnhQueryStage=new Stage();
            TuanAnhQueryStage.setTitle("Danh cho nguoi Quan Li");
            TuanAnhQueryStage.setScene(new Scene(root, 1280, 700));
            TuanAnhQueryStage.show();
        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
    }


}
