package staff;

public class Employee {

    String name;
    String niNumber;
    public int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null)
        this.name = name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public double raiseSalary(double raise){
        if (raise >0) {
            return this.salary += raise;
        }
        return salary;
    }

    public int getPayBonus() {
        return this.salary / 100;
    }
}
