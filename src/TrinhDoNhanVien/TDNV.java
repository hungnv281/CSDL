package TrinhDoNhanVien;

public class TDNV {
    private String maTDHV,nameTDHV,chuyenNganh;

    public TDNV(String maTDHV, String nameTDHV, String chuyenNganh) {
        this.maTDHV = maTDHV;
        this.nameTDHV = nameTDHV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaTDHV() {
        return maTDHV;
    }

    public void setMaTDHV(String maTDHV) {
        this.maTDHV = maTDHV;
    }

    public String getNameTDHV() {
        return nameTDHV;
    }

    public void setNameTDHV(String nameTDHV) {
        this.nameTDHV = nameTDHV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "TDNV{" +
                "maTDHV='" + maTDHV + '\'' +
                ", nameTDHV='" + nameTDHV + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}

