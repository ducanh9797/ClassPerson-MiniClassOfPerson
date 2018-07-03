public class Staff extends Person{
    String School;
    double Pay;

    public Staff(String name, String address, String School, double Pay) {
        super(name, address);
        this.Pay = Pay;
        this.School = School;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public double getPay() {
        return Pay;
    }

    public void setPay(double pay) {
        Pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "School='" + School + '\'' +
                ", Pay=" + Pay +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
