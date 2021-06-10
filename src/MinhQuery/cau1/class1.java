package MinhQuery.cau1;

public class class1 {


        private String mapb;
        private String tenpb;
        private String sdtpb;
        private String diachipb;
        private Integer soluong;

        public class1(String mapb, String tenpb, String sdtpb, String diachipb, Integer soluong) {
            this.mapb = mapb;
            this.tenpb = tenpb;
            this.sdtpb = sdtpb;
            this.diachipb = diachipb;
            this.soluong = soluong;
        }

        public String getMapb() {
            return mapb;
        }

        public void setMapb(String mapb) {
            this.mapb = mapb;
        }

        public String getTenpb() {
            return tenpb;
        }

        public void setTenpb(String tenpb) {
            this.tenpb = tenpb;
        }

        public String getSdtpb() {
            return sdtpb;
        }

        public void setSdtpb(String sdtpb) {
            this.sdtpb = sdtpb;
        }

        public String getDiachipb() {
            return diachipb;
        }

        public void setDiachipb(String diachipb) {
            this.diachipb = diachipb;
        }

        public Integer getSoluong() {
            return soluong;
        }

        public void setSoluong(Integer soluong) {
            this.soluong = soluong;
        }

        @Override
        public String toString() {
            return "class1{" +
                    "mapb='" + mapb + '\'' +
                    ", tenpb='" + tenpb + '\'' +
                    ", sdtpb='" + sdtpb + '\'' +
                    ", diachipb='" + diachipb + '\'' +
                    ", soluong=" + soluong +
                    '}';
        }
}

