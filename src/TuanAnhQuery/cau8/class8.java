package TuanAnhQuery.cau8;

import java.sql.Date;

public class class8 {
    private String manv,hoten;
    private Date ngaysinh;
    private String quequan,sdt,bacluong;

    public class8(String manv, String hoten, Date ngaysinh, String quequan, String sdt, String bacluong) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.bacluong = bacluong;
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

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
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

    public String getBacluong() {
        return bacluong;
    }

    public void setBacluong(String bacluong) {
        this.bacluong = bacluong;
    }

    @Override
    public String toString() {
        return "class8{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", quequan='" + quequan + '\'' +
                ", sdt='" + sdt + '\'' +
                ", bacluong='" + bacluong + '\'' +
                '}';
    }
}
