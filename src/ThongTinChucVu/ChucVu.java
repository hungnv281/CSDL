package ThongTinChucVu;

public class ChucVu {
    private  String tencv,macv;

    public ChucVu(String tencv, String macv) {
        this.tencv = tencv;
        this.macv = macv;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "tencv='" + tencv + '\'' +
                ", macv='" + macv + '\'' +
                '}';
    }
}
