package TuanAnhQuery.cau3;

public class class3 {
    private String hoten, tenCV, tenPB;

    public class3(String hoten, String tenCV, String tenPB) {
        this.hoten = hoten;
        this.tenCV = tenCV;
        this.tenPB = tenPB;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    @Override
    public String toString() {
        return "class3{" +
                "hoten='" + hoten + '\'' +
                ", tenCV='" + tenCV + '\'' +
                ", tenPB='" + tenPB + '\'' +
                '}';
    }
}
