
import java.util.Scanner;
public class Runner {
public static void main(String args[]){

    System.out.println("Welcome to your new school.");
    int count =1;
    while(count ==1 ){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to: create student, create teacher, create section, add student to a section, add teacher to a section, remove a student from a section, check awesomeness levels, or search for a student");
    String input1 = scanner.nextLine();

        if (input1.toLowerCase().equals("create student")) {
            System.out.println("please input students first name, last name, grade");
            String createStudent = scanner.nextLine();
            String[] array = createStudent.split(", ");
            Student student = new Student(array[0], array[1], Integer.parseInt(array[2]));
            System.out.println("Created new entry for " + array[0] + " " + array[1]);
        }

        else if (input1.toLowerCase().equals("create teacher")) {
            System.out.println("please input teachers first name, last name, subject");
            String createTeacher = scanner.nextLine();
            String[] array = createTeacher.split(", ");
            Teacher teacher = new Teacher(array[0], array[1], array[2]);
            System.out.println("Created new entry for " + array[0] + " " + array[1]);
        }

        else if (input1.toLowerCase().equals("create section")) {
            System.out.println("please input teachers first name, last name, subject, max class size");
            String createSection = scanner.nextLine();
            String[] array = createSection.split(", ");
            Section section = new Section(array[0], array[1], array[2], Integer.parseInt(array[3]));
            System.out.println("Created new entry for " + array[2]);
            for (int i = 0; i < Teacher.teacher.size(); i++) {
                if (Teacher.teacher.get(i).firstName.toLowerCase().equals(array[0].toLowerCase()) && Teacher.teacher.get(i).lastName.toLowerCase().equals(array[1].toLowerCase())) {
                    for (int j = 0; j < Section.sections.size(); j++) {
                        if (Section.sections.get(j).classname.toLowerCase().equals(array[2].toLowerCase())) {
                            Section.sections.get(j).addTeacher(Teacher.teacher.get(i));
                        }
                    }
                }
            }
        }

        else if(input1.toLowerCase().equals("add student to a section")) {
            System.out.println("please input students first name, last name, and desired section");
            String AddStudent = scanner.nextLine();
            String[] array = AddStudent.split(", ");
            String first = array[0];
            String last = array[1];
            System.out.println("Created new entry for " + array[0] + " " + array[1]);
            for (int i = 0; i < Student.student.size(); i++) {
                if(Student.student.get(i).firstName.toLowerCase().equals(first.toLowerCase()) && Student.student.get(i).lastName.toLowerCase().equals(last.toLowerCase())) {
                    for(int j = 0; j < Section.sections.size(); j++) {
                        if(Section.sections.get(j).classname.toLowerCase().equals(array[2].toLowerCase())) {
                            Section.sections.get(j).addStudent(Student.student.get(i));
                        }
                    }
                }
            }
        }

        else if(input1.toLowerCase().equals("add teacher to a section")) {
            System.out.println("please input teachers first name, last name, and desired section");
            String AddTeacher = scanner.nextLine();
            String[] array = AddTeacher.split(", ");
            String first = array[0];
            String last = array[1];
            System.out.println("Created new entry for " + array[0] + " " + array[1]);
            for (int i = 0; i < Teacher.teacher.size(); i++) {
                if(Teacher.teacher.get(i).firstName.toLowerCase().equals(first.toLowerCase()) && Teacher.teacher.get(i).lastName.toLowerCase().equals(last.toLowerCase())) {
                    for(int j = 0; j < Section.sections.size(); j++) {
                        if(Section.sections.get(j).classname.toLowerCase().equals(array[2].toLowerCase())) {
                            Section.sections.get(j).addTeacher(Teacher.teacher.get(i));

                        }
                    }
                }
            }
        }

        else if (input1.toLowerCase().equals("remove student from a section")) {
            System.out.println("please input student ID and desired section to remove");
            String RemoveStudent = scanner.nextLine();
            String[] array = RemoveStudent.split(", ");
            Double id = Double.parseDouble(array[0]);
            for(int j = 0; j < Section.sections.size(); j++) {
                if (Section.sections.get(j).classname.equals(array[1])) {
                    Section.sections.get(j).removeStudent(id);
                }
            }
        }

        else if (input1.toLowerCase().equals("check awesomeness levels")) {
            System.out.println("please input the section you want to check awesomeness levels of");
            String AWS = scanner.nextLine();
            for(int i = 0; i < Section.sections.size(); i++) {
                if (Section.sections.get(i).classname.equals(AWS)) {
                    Section.sections.get(i).awesomeness();
                }
            }
        }

        else if (input1.toLowerCase().equals("search for a student")){
            System.out.println("Please enter the first and last name of the student");
            String name = scanner.nextLine();
            String[] var = name.split(", ");
            for (int i = 0; i < Student.student.size(); i++) {
                if (Student.student.get(i).firstName.equals(var[0]) && Student.student.get(i).lastName.equals(var[1])) {
                    System.out.println("Student successfully found, returning object ID and Awesomeness");
                    System.out.println(Student.student.get(i).id);
                    System.out.println(Student.student.get(i).awesomeness);
                }
            }
        }

        else {
            System.out.println("Sorry, I didn't catch that. Try again.");
        }

                    }
                }
            }
