
import java.util.ArrayList;
public class Section {
    String name;
    String classname;
    int maxSize;
    int currentSize;
    ArrayList<Student> student= new ArrayList<>();
    ArrayList<Teacher> teacher = new ArrayList<>();
    public static ArrayList<Section> sections= new ArrayList<>();

    public Section(String TFirst, String TLast, String className, int spaces ){
        Teacher human = new Teacher(TFirst, TLast, className);
        this.maxSize = spaces;
        this.currentSize = student.size();
        this.classname = className;
        sections.add(this);
    }

    public void addStudent(Student name){

        student.add(name);
    }

    public void addTeacher(Teacher name){

        teacher.add(name);
    }

    public void removeStudent(double id){
        for(int i = 0; i<student.size(); i++){
            if(student.get(i).id==id){
                student.remove(i);
            }
        }
    }

    public void awesomeness(){
        double awesomeness = 0;
        for(int i = 0; i<student.size(); i++){
        awesomeness += student.get(i).awesomeness;
        }
        awesomeness = awesomeness /student.size();
        System.out.println(awesomeness);
    }

    public void sectionRemaining(){
        int Remaining = maxSize - currentSize;
        System.out.println(Remaining);
    }
}
