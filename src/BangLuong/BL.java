package BangLuong;

public class BL {
    private Float luongCoBan;
    private Float heSoLuong;
    private Float heSoPhuCap;
    private String bacLuong;


    public BL(String bacluong, Float luongcb, Float hsluong, Float hsphucap) {
        this.luongCoBan = luongcb;
        this.heSoLuong = hsluong;
        this.heSoPhuCap = hsphucap;
        this.bacLuong = bacluong;
    }

    public Float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Float getHeSoPhuCap() {
        return heSoPhuCap;
    }

    public void setHeSoPhuCap(Float heSoPhuCap) {
        this.heSoPhuCap = heSoPhuCap;
    }

    public String getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(String bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "BL{" +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ", heSoPhuCap=" + heSoPhuCap +
                ", bacLuong='" + bacLuong + '\'' +
                '}';
    }
}
