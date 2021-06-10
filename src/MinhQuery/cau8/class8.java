package MinhQuery.cau8;

import java.sql.Date;

public class class8 {
    private String manv,tencv,tenpb;
    private Date  ngayketthuc,ngaytiepnhan;

    public class8(String manv, String tencv, String tenpb, Date ngayketthuc, Date ngaytiepnhan) {
        this.manv = manv;
        this.tencv = tencv;
        this.tenpb = tenpb;
        this.ngayketthuc = ngayketthuc;
        this.ngaytiepnhan = ngaytiepnhan;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
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

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public Date getNgaytiepnhan() {
        return ngaytiepnhan;
    }

    public void setNgaytiepnhan(Date ngaytiepnhan) {
        this.ngaytiepnhan = ngaytiepnhan;
    }

    @Override
    public String toString() {
        return "class8{" +
                "manv='" + manv + '\'' +
                ", tencv='" + tencv + '\'' +
                ", tenpb='" + tenpb + '\'' +
                ", ngayketthuc=" + ngayketthuc +
                ", ngaytiepnhan=" + ngaytiepnhan +
                '}';
    }
}
