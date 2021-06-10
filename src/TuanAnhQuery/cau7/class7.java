package TuanAnhQuery.cau7;

import java.sql.Date;

public class class7 {
    private String manv,hoten;
    private Date ngaysinh;
    private String  gioitinh,quequan,sdt,tenpb;

    public class7(String manv, String hoten, Date ngaysinh,
                  String gioitinh, String quequan, String sdt, String tenpb) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.tenpb = tenpb;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getTenpb() {
        return tenpb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    @Override
    public String toString() {
        return "class7{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", gioitinh='" + gioitinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tenpb='" + tenpb + '\'' +
                '}';
    }
}
