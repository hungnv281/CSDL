package HungQuery.cau1;

public class class1 {
    private String manv,hoten,mapb;

    public class1(String manv, String hoten, String mapb) {
        this.manv = manv;
        this.hoten = hoten;
        this.mapb = mapb;
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

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    @Override
    public String toString() {
        return "class1{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", mapb='" + mapb + '\'' +
                '}';
    }
}
