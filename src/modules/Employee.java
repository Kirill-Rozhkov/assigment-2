package modules;

public class Employee extends Person {
    public double salary;
    public Employee() {
        super();
    }

    public Employee(String name, String surname, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition("modules.Employee");
        setSalary(salary);
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }


    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
