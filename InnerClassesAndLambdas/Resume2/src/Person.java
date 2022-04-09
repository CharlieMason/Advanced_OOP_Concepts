/* TODO */
//Copy the Person class from Task 2 here. Copy->Paste
import java.time.LocalDate;
import java.time.Period;

//Declare the class
public class Person{
    //Create two private member variables to hold the name and the birthDate of the employee. The birthdate has to be a LocalDate
    private String name;
    private LocalDate birthDate;

    //Create a member inner class called Position with two
    //member variables: a name and a salary. Override the toString()
    //method as specified in the instructions
    private class Position{
        String name;
        double salary;

        public Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name+":"+salary;
        }
    }


    private Position position;



    Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }


    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(this.birthDate, now);
        return period.getYears();
    }


    public void setPosition(String name, double salary) {
        this.position = new Position(name, salary);
    }

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


// Finish closing curly braces and the class.
}