import java.util.HashMap;
import java.util.Map;

public class Employee {
    static HashMap<Integer, Employee> empmap = new HashMap<>();
    static int counter ;
    public int id;
    public String name;
    public String designation;
    public Double salary;

    static {
        counter = 0;
    }

    public static int employeeCount() {
        return counter;
    }

    public Employee(String name, String designation, Double salary) {
        counter += 1;
        this.id = counter;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        empmap.put(counter, this);
    }

    public Double getSalary() {
        return salary;
    }

    public void promote(String designation, Double promotionAmount) {
        this.designation = designation;
        this.salary += promotionAmount;
    }

    public static Employee highestPaid() {
        Employee maxSalaried = empmap.get(1);
        for(Map.Entry<Integer, Employee> entry : empmap.entrySet()) {
            if(maxSalaried.salary < entry.getValue().getSalary()) {
                maxSalaried = entry.getValue();
            }
        }
        return maxSalaried;
    }

    public String toString() {
        return  this.id + " " + this.name + " " + this.designation + " " + this.salary;
    }
}
