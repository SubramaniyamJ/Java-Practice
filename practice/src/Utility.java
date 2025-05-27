import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Utility{
    Scanner sc = new Scanner(System.in);
    public static String checkExistance(HashMap<Integer, HashMap<Character, ArrayList<Student>>>school, int std, char sec) {
        if(school.get(std) == null) {
            return "1";
        }
        else {
            if(school.get(std).get(sec) == null) {
                return "2";
            }
        }
        return "0";
    }

    public static void addMarksForAStudent(HashMap<Integer, Standard>standardHashMap, Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
//        System.out.println(student.getStd());
//            System.out.println(standardHashMap.get(12).getSubjects().get(0));
        for(String s : standardHashMap.get(student.getStd()).getSubjects()) {
            System.out.println(s + " : ");
            student.putMarks(s, Double.parseDouble(sc.nextLine()));
        }
    }
}