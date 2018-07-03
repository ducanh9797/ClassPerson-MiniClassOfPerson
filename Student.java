public class Student extends Person {
    int year;
    double fee;
    String program;

    public Student(String name, String address, int year, double free, String program) {
        super(name, address);
        this.year = year;
        this.fee = free;
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", fee=" + fee +
                ", program='" + program + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
