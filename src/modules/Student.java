package modules;

public class Student extends Person {
    private double gpa;
    public double salary;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
        setSalary();
        setPosition("Student");
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) { return 36660.00; };
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getSalary() + " tenge";
    }

    public double getGpa() {
        return gpa;
    }

    public double getSalary() {
        return salary;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSalary() {
        this.salary = getPaymentAmount();
    }
}
