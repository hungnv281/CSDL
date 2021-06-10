package HungQuery.cau10;

public class class10 {
    private String manv,hoten,quequan,tenpb,tentdhv;

    public class10(String manv, String hoten, String quequan, String tenpb, String tentdhv) {
        this.manv = manv;
        this.hoten = hoten;
        this.quequan = quequan;
        this.tenpb = tenpb;
        this.tentdhv = tentdhv;
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

    public String getTenpb() {
        return tenpb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    public String getTentdhv() {
        return tentdhv;
    }

    public void setTentdhv(String tentdhv) {
        this.tentdhv = tentdhv;
    }

    @Override
    public String toString() {
        return "class10{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", quequan='" + quequan + '\'' +
                ", tenpb='" + tenpb + '\'' +
                ", tentdhv='" + tentdhv + '\'' +
                '}';
    }
}
