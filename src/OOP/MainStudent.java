package OOP;

import OOP.model.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student.getInfoUniversity();

        Student a = new Student("Hung", 22, 1.77f);

        System.out.println("University (from class): " + Student.universityName);
        System.out.println("University (from instance): " + a.universityName);

        System.out.println("Total (from class): " + Student.total);
        Student b = new Student("Quoc", 18, 1.66f);
        System.out.println("Total (from instance): " + b.total);
    }
}
