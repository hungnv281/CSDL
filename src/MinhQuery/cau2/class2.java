package MinhQuery.cau2;

import java.sql.Date;

public class class2 {
    private String manv,hoten,ngaysinh,quequan,gioitinh,dantoc,sdt;
    private Date ngaybd;

    public class2(String manv, String hoten, String ngaysinh, String quequan,
                  String gioitinh, String dantoc, String sdt, Date ngaybd) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.gioitinh = gioitinh;
        this.dantoc = dantoc;
        this.sdt = sdt;
        this.ngaybd = ngaybd;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public Date getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(Date ngaybd) {
        this.ngaybd = ngaybd;
    }

    @Override
    public String toString() {
        return "class2{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", dantoc='" + dantoc + '\'' +
                ", sdt='" + sdt + '\'' +
                ", ngaybd=" + ngaybd +
                '}';
    }
}
