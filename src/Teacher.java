import java.util.ArrayList;
public class Teacher extends Person{
    String subject;
    public static ArrayList<Teacher> teacher = new ArrayList<>();

    public Teacher(String firstName, String lastName, String SUBJECT){
        super(firstName,lastName);
        subject=SUBJECT;
        teacher.add(this);
    }

}
