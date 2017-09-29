import java.util.ArrayList;
public class Student extends Person {
    int grade;
    int awesomeness;
    public static ArrayList<Student> student = new ArrayList<>() ;
    public Student(String firstName, String lastName, int year){
        super(firstName, lastName);
        grade = year;
        double rando = 1 + (Math.random()*9);
        awesomeness = (int) rando;
        student.add(this);
    }
}
