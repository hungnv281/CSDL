package HungQuery.cau2;

public class class2 {
    private String mapb;
    private Integer number_employees_male, number_employees_female;

    public class2(String mapb, Integer number_employees_male, Integer number_employees_female) {
        this.mapb = mapb;
        this.number_employees_male = number_employees_male;
        this.number_employees_female = number_employees_female;
    }

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public Integer getNumber_employees_male() {
        return number_employees_male;
    }

    public void setNumber_employees_male(Integer number_employees_male) {
        this.number_employees_male = number_employees_male;
    }

    public Integer getNumber_employees_female() {
        return number_employees_female;
    }

    public void setNumber_employees_female(Integer number_employees_female) {
        this.number_employees_female = number_employees_female;
    }

    @Override
    public String toString() {
        return "class1{" +
                "mapb='" + mapb + '\'' +
                ", number_employees_male=" + number_employees_male +
                ", number_employees_female=" + number_employees_female +
                '}';
    }
}
