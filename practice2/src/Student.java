public class Student {
    private String regNo;
    public String name;
    public String age;

    public Student(String regNo, String age, String name) {
        this.regNo = regNo;
        this.age = age;
        this.name = name;
    }

    public Student(String regNo) {
        this.regNo = regNo;
    }

    public Student(String name, String age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.regNo + " " + this.name + " " + this.age;
    }
 }
