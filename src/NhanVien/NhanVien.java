package NhanVien;

public class NhanVien {
    private String maNV,name,dob,address,gender,nation,phonenumber,maPB,maCV,maTDHV,bacLuong;

    public NhanVien(String maNV, String name, String dob, String address, String gender, String nation,
                            String phonenumber, String maPB, String maCV, String maTDHV, String bacLuong) {
        this.maNV = maNV;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.nation = nation;
        this.phonenumber = phonenumber;
        this.maPB = maPB;
        this.maCV = maCV;
        this.maTDHV = maTDHV;
        this.bacLuong = bacLuong;
    }

    public NhanVien(String mã_nhân_viên, String mã_trình_độ_học_vấn, String trình_độ_học_vấn, String chuyên_ngành){
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getMaTDHV() {
        return maTDHV;
    }

    public void setMaTDHV(String maTDHV) {
        this.maTDHV = maTDHV;
    }

    public String getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(String bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "DanhSachNhanVien{" +
                "maNV='" + maNV + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", nation='" + nation + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", maPB='" + maPB + '\'' +
                ", maCV='" + maCV + '\'' +
                ", maTDHV='" + maTDHV + '\'' +
                ", bacLuong='" + bacLuong + '\'' +
                '}';
    }
}
