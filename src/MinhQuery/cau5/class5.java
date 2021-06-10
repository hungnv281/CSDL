package MinhQuery.cau5;

public class class5 {
    private String manv,hoten,ngaysinh,quequan,sdt;
    private Double tienluong;

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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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

    public Double getTienluong() {
        return tienluong;
    }

    public void setTienluong(Double tienluong) {
        this.tienluong = tienluong;
    }

    @Override
    public String toString() {
        return "class5{" +
                "manv='" + manv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tienluong=" + tienluong +
                '}';
    }

    public class5(String manv, String hoten, String ngaysinh, String quequan, String sdt, Double tienluong) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.tienluong = tienluong;
    }
}
