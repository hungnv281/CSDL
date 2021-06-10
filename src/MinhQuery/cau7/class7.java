package MinhQuery.cau7;

public class class7 {
    private String manv,hoten,quequan,sdt,tentdhv,tencv,tenpb;

    public class7(String manv, String hoten, String quequan,
                  String sdt, String tentdhv, String tencv, String tenpb) {
        this.manv = manv;
        this.hoten = hoten;
        this.quequan = quequan;
        this.sdt = sdt;
        this.tentdhv = tentdhv;
        this.tencv = tencv;
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

    @Override
    public String toString() {
        return "class7{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", quequan='" + quequan + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tentdhv='" + tentdhv + '\'' +
                ", tencv='" + tencv + '\'' +
                ", tenpb='" + tenpb + '\'' +
                '}';
    }
}
