import java.util.ArrayList;
import java.util.HashMap;

public class Section {
    private char name;
    private HashMap<Integer, ArrayList<Student>>students = new HashMap<>();
    private ArrayList<Student> topper = new ArrayList<>();
    private int passCount = 0;

    public Section(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public ArrayList<Student> getTopper() {
        return topper;
    }

    public void setTopper(ArrayList<Student> topper) {
        this.topper = topper;
    }

    public HashMap<Integer, ArrayList<Student>> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, ArrayList<Student>> students) {
        this.students = students;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public void addStudent(Student student) {
        //calculating toppers
        System.out.println("In add student section wise");
        if(this.students.isEmpty()) {
            System.out.println("In section empty");
            this.topper.add(student);
        } else {
            if(student.getAvgMark() > this.topper.get(0).getAvgMark()) {
                System.out.println("In section greater");
                this.topper.clear();
                this.topper.add(student);
            } else if(student.getAvgMark().equals(this.topper.get(0).getAvgMark())) {
                System.out.println("In section equal");
                this.topper.add(student);
            }
        }
        //calculating pass count
        if(student.getAvgMark() >= 45) {
            this.passCount += 1;
        }
        this.students.computeIfAbsent(student.getRegNo(), k -> new ArrayList<>()).add(student);
    }
}
