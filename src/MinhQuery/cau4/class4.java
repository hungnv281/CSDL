package MinhQuery.cau4;

import java.sql.Date;

public class class4 {
    private String manv, hoten;
    private Date ngaysinh;
    private String quequan, dantoc, sdt, tencv;
    private Date ngaytiepnhan;

    public class4(String manv, String hoten, Date ngaysinh,
                  String quequan, String dantoc, String sdt, String tencv, Date ngaytiepnhan) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.dantoc = dantoc;
        this.sdt = sdt;
        this.tencv = tencv;
        this.ngaytiepnhan = ngaytiepnhan;
    }

    @Override
    public String toString() {
        return "class4{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", quequan='" + quequan + '\'' +
                ", dantoc='" + dantoc + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tencv='" + tencv + '\'' +
                ", ngaytiepnhan=" + ngaytiepnhan +
                '}';
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

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    public Date getNgaytiepnhan() {
        return ngaytiepnhan;
    }

    public void setNgaytiepnhan(Date ngaytiepnhan) {
        this.ngaytiepnhan = ngaytiepnhan;
    }
}
