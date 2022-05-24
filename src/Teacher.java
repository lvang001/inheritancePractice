public class Teacher extends Person {
    private int salary;

    Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + "\n salary " + this.salary + " euro/month";
    }

}
