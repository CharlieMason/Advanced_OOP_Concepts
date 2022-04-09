/* TODO */
//Import the java.time.LocalDate and java.time.Period classes.
//You will need them later.
import java.time.LocalDate;
import java.time.Period;
/* TODO */
//Declare the class
public class Person {
    //
    private String name;
    private LocalDate birthDate;
    /* TODO */
 /*   Create a
    member inner

    class called Position with two
            member variables:
    a name
    and a
    salary.Override the

    toString()

    method as
    specified in
    the instructions*/

    private class Position {
        String name;
        double salary;

        public Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ":" + salary;
        }
    }

    /* TODO */
 //   Create a

  //  member variable(of Person) of type Position.
    private Position position;

    //

    Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    //

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(this.birthDate, now);
        return period.getYears();
    }

    //

    public void setPosition(String name, double salary) {
        this.position = new Position(name, salary);
    }

    //

    public Position getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", position=" + position +
                '}';
    }



}