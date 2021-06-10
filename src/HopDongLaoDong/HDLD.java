package HopDongLaoDong;

import java.sql.Date;

public class HDLD {
    private String maHD, maNV, loaiHD;
    private Date ngayBD, ngayKT;

    public HDLD(String maHD, String maNV, String loaiHD, Date ngayBD, Date ngayKT) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.loaiHD = loaiHD;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    @Override
    public String toString() {
        return "HDLD{" +
                "maHD='" + maHD + '\'' +
                ", maNV='" + maNV + '\'' +
                ", loaiHD='" + loaiHD + '\'' +
                ", ngayBD=" + ngayBD +
                ", ngayKT=" + ngayKT +
                '}';
    }
}
