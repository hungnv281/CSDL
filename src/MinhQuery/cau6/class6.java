package MinhQuery.cau6;

public class class6 {
    private String manv,hoten, quequan,gioitinh,sdt,tentdhv,cnganh;

    public class6(String manv, String hoten, String quequan,
                  String gioitinh, String sdt, String tentdhv, String cnganh) {
        this.manv = manv;
        this.hoten = hoten;
        this.quequan = quequan;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.tentdhv = tentdhv;
        this.cnganh = cnganh;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    @Override
    public String toString() {
        return "class6{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", quequan='" + quequan + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tentdhv='" + tentdhv + '\'' +
                ", cnganh='" + cnganh + '\'' +
                '}';
    }
}
