package TuanAnhQuery.cau1;

import java.sql.Date;

public class class1 {
    private String manv, hoten,quequan,gioitinh,dantoc,sdt,mapb,macv,matdhv,bacluong;
    private Date ngaysinh;
    public class1(String manv, String hoten, Date ngaysinh, String quequan, String gioitinh, String dantoc,
                  String sdt, String mapb, String macv, String matdhv, String bacluong) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.gioitinh = gioitinh;
        this.dantoc = dantoc;
        this.sdt = sdt;
        this.mapb = mapb;
        this.macv = macv;
        this.matdhv = matdhv;
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

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getMatdhv() {
        return matdhv;
    }

    public void setMatdhv(String matdhv) {
        this.matdhv = matdhv;
    }

    public String getBacluong() {
        return bacluong;
    }

    public void setBacluong(String bacluong) {
        this.bacluong = bacluong;
    }

    @Override
    public String toString() {
        return "class1{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", dantoc='" + dantoc + '\'' +
                ", sdt='" + sdt + '\'' +
                ", mapb='" + mapb + '\'' +
                ", macv='" + macv + '\'' +
                ", matdhv='" + matdhv + '\'' +
                ", bacluong='" + bacluong + '\'' +
                '}';
    }
}
