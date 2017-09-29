
public class Person {
    double rando = 1000000 + (Math.random() * 9000000);
    int id = (int) rando;
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
