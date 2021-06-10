package MinhQuery.cau9;

import java.sql.Date;

public class class9 {
    private String manv,hoten,sdt,tencv,tenpb;
    private Date ngaybd;
    private Float thoigian;

    public class9(String manv, String hoten, String sdt,
                  String tencv, String tenpb, Date ngaybd, Float thoigian) {
        this.manv = manv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.tencv = tencv;
        this.tenpb = tenpb;
        this.ngaybd = ngaybd;
        this.thoigian = thoigian;
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

    public String getTenpb() {
        return tenpb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    public Date getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(Date ngaybd) {
        this.ngaybd = ngaybd;
    }

    public Float getThoigian() {
        return thoigian;
    }

    public void setThoigian(Float thoigian) {
        this.thoigian = thoigian;
    }

    @Override
    public String toString() {
        return "class9{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tencv='" + tencv + '\'' +
                ", tenpb='" + tenpb + '\'' +
                ", ngaybd=" + ngaybd +
                ", thoigian=" + thoigian +
                '}';
    }
}
