import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("12343dad3", 100.00, "subru");

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");

        int n = Integer.parseInt(sc.nextLine());
        if(n == 1) {
            System.out.println("Enter the amount to be deposited : " );
            Double amount = Double.parseDouble(sc.nextLine());
            acc.deposit(amount);
        } else {
            System.out.println("Enter the amount to be withdrawed : " );
            Double amount = Double.parseDouble(sc.nextLine());
            acc.deposit(amount);
        }

        Student student1 = new Student("123", "23", "subru");
        Student student2 = new Student("323832" );
        Student student3 = new Student("Mani", "43");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Employee emp1 = new Employee("abc", "lead", 232.121);
        Employee emp2 = new Employee("akjfh", "senior manager", 23242.121);
        Employee emp3 = new Employee("wgwef", "developer", 32.121);

        while(true)
        {
            System.out.println("1.getcount\n2.promote\n3.maxsalaried\n4.exit\n");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println(Employee.employeeCount());
            } else if(choice == 2){
                System.out.println("Enter the employee id to promote : ");
                int id = Integer.parseInt(sc.nextLine());
                Employee emp = Employee.empmap.get(id);
                System.out.println("Enter the promotion role : ");
                String role = sc.nextLine();
                System.out.println("Enter the promotion amount : ");
                Double promotionAmount = Double.parseDouble(sc.nextLine());
                emp.promote(role, promotionAmount);
            } else if(choice == 3) {
                System.out.println(Employee.highestPaid());
            } else {
                break;
            }

            System.out.println(emp1);
            System.out.println(emp2);
            System.out.println(emp3);
        }

        ComplexNumber num1 = new ComplexNumber(1, 2.2F);
        ComplexNumber num2 = new ComplexNumber(2, 3.2F);

        System.out.println(ComplexNumber.add(num2, 4));

        Distance d1 = new Distance(12);
        Distance d2 = new Distance(12, 48);
        Distance d3 = new Distance(67);
        Distance d4 = new Distance(2, 4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

    }
}
