import java.util.*;

class Main{
    static HashMap<Integer, HashMap<Character, ArrayList<Student>>>school = new HashMap<>();
    static HashMap<Integer, Standard>standardHashMap = new HashMap<>();
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        while (true) {
            System.out.println("1.Add Student \n2.Get toppers");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.println("Enter student Name : ");
                String name = sc.nextLine();
                System.out.println("Enter student age : ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Enter student gender : (Male / Female)");
                String gender = sc.nextLine();
                System.out.println("Enter Standard : ");
                int std = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the section : (in caps)");
                char sec = sc.next().charAt(0);
                sc.nextLine();

                Student student = new Student(name, age, gender, std, sec);

                String s = Utility.checkExistance(school, std, sec);
                Standard standard = null;
                Section section = null;
                //class or section not found
                if (s.equals("1")) {
                    standard = new Standard(std);
                    standardHashMap.put(std, standard);
                    section = new Section(sec);
                    System.out.println("There is no standard exists as you specified \nEnter the subjects in the specified" +
                            " standard");
                    System.out.println("(Type \"continue\" when you finished entering all subjects)");
                    while (true) {
                        String subjectName = sc.nextLine();
                        if (subjectName.equals("continue")) break;
                        standard.addSubjects(subjectName);
//                    System.out.println(subjectName);
                    }

                } else if (s.equals("2")) {
                    standard = standardHashMap.get(std);
                    section = new Section(sec);
                    System.out.println("Entered section not found in Standard " + std + " Thus new section " + sec + " created");
                }  else {
                    standard = standardHashMap.get(std);
                    section = standard.getSections().get(sec);
                }
                Utility.addMarksForAStudent(standardHashMap, student);
                if(s.equals("1")) {
                    section.addStudent(student);
                    standard.addSection(section);
                } else if(s.equals("2")) {
                    section.addStudent(student);
                    standard.addSection(section);
                } else {
                    section.addStudent(student);
                }
                standard.updateStandardToppers(student);
                school.computeIfAbsent(std, k -> new HashMap<>())
                        .computeIfAbsent(sec, k -> new ArrayList<>()).add(student);

                System.out.println("Student added successfully");
                System.out.println(student);
            } else if(choice == 2) {
                System.out.println("1.Standard wise topper\n2.Section wise topper");
                int choice2 = Integer.parseInt(sc.nextLine());
                System.out.println("Enter a valid standard : ");
                int std2 = Integer.parseInt(sc.nextLine());
                if(choice2 == 1) {
                    standardHashMap.get(std2).getTopper().forEach(System.out::println);
                } else if(choice2 == 2) {
                    System.out.println("Enter a valid section in the " + std2 + " standard");
                    char sec2 = sc.next().charAt(0);
                    sc.nextLine();
                    standardHashMap.get(std2).getSections().get(sec2).getTopper().forEach(System.out::println);
                }
            } else {
                break;
            }
        }
    }
}