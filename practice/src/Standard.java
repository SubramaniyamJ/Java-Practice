import java.util.ArrayList;
import java.util.HashMap;

public class Standard {
    private int std;
    private HashMap<Character, Section>sections = new HashMap<>();
    private ArrayList<Student> topper = new ArrayList<>();
    private int passCount;
    private ArrayList<String>subjects = new ArrayList<>();

    public void setStd(int std) {
        this.std = std;
    }

    public void setSections(HashMap<Character, Section> sections) {
        this.sections = sections;
    }

    public void setTopper(ArrayList<Student> topper) {
        this.topper = topper;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public int getPassCount() {
        return passCount;
    }

    public ArrayList<Student> getTopper() {
        return topper;
    }

    public HashMap<Character, Section> getSections() {
        return sections;
    }

    public int getStd() {
        return std;
    }


    public Standard(int std) {
        this.std = std;
    }
    public void addSubjects(String subjectName) {
        this.subjects.add(subjectName);

    }

    public void addSection(Section section) {
        this.sections.put(section.getName(), section);
    }

    public void updateStandardToppers(Student student) {
        if(this.topper.isEmpty()) {
            this.topper.add(student);
        } else {
            if(this.topper.get(0).getAvgMark() < student.getAvgMark()) {
                this.topper.clear();
                this.topper.add(student);
            } else if(this.topper.get(0).getAvgMark().equals(student.getAvgMark())) {
                this.topper.add(student);
            }
        }
    }
}
