package TuanAnhQuery.cau5;

import java.sql.Date;

public class class5 {
    private String manv,hoten;
    private Date ngaysinh;
    private String quequan,sdt,tentdhv;

    public class5(String manv, String hoten, Date ngaysinh,
                  String quequan, String sdt, String tentdhv) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.tentdhv = tentdhv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTentdhv() {
        return tentdhv;
    }

    public void setTentdhv(String tentdhv) {
        this.tentdhv = tentdhv;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "class5{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", quequan='" + quequan + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tentdhv='" + tentdhv + '\'' +
                '}';
    }
}
