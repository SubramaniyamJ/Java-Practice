import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private static int counter = 0;
    private int regNo;
    private String name;
    private int age;
    private String gender;
    private int std;
    private char sec;
    private HashMap<String, Double> marksBySubject = new HashMap<>();
    private Double totalMarks = 0.0;
    private Double avgMark = 0.0;

    public Student(String name, int age, String gender, int std, char sec) {
        this.regNo = ++counter;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.std = std;
        this.sec = sec;
    }

    public Double getTotalMarks() {
        return totalMarks;
    }

    public Double getAvgMark() {
        return avgMark;
    }

    public char getSec() {
        return sec;
    }

    public void setSec(char sec) {
        this.sec = sec;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }


    public void putMarks(String subject, Double marks) {
        this.marksBySubject.put(subject, marks);
        this.totalMarks += marks;
        this.avgMark = this.totalMarks / this.marksBySubject.size();
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public HashMap<String, Double> getMarksBySubject() {
        return marksBySubject;
    }

    public void setMarksBySubject(HashMap<String, Double> marksBySubject) {
        this.marksBySubject = marksBySubject;
    }

    @Override
    public String toString() {
        return regNo + " | " + name + " | " + std + " | "  + sec + " | " + age + " | " + totalMarks + " | " + avgMark;
    }
}
