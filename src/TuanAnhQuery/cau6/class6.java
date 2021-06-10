package TuanAnhQuery.cau6;

public class class6 {
    private String bacluong;
    private Double luongcb,hsluong,hsphucap;

    public class6(String bacluong, Double luongcb, Double hsluong, Double hsphucap) {
        this.bacluong = bacluong;
        this.luongcb = luongcb;
        this.hsluong = hsluong;
        this.hsphucap = hsphucap;
    }

    public String getBacluong() {
        return bacluong;
    }

    public void setBacluong(String bacluong) {
        this.bacluong = bacluong;
    }

    public Double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(Double luongcb) {
        this.luongcb = luongcb;
    }

    public Double getHsluong() {
        return hsluong;
    }

    public void setHsluong(Double hsluong) {
        this.hsluong = hsluong;
    }

    public Double getHsphucap() {
        return hsphucap;
    }

    public void setHsphucap(Double hsphucap) {
        this.hsphucap = hsphucap;
    }

    @Override
    public String toString() {
        return "class6{" +
                "bacluong='" + bacluong + '\'' +
                ", luongcb=" + luongcb +
                ", hsluong=" + hsluong +
                ", hsphucap=" + hsphucap +
                '}';
    }
}
