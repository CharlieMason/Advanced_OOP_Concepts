import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
    public class Education {
        String school;
        String major;

        public Education(String schoolName, String major) {
            this.school = schoolName;
            this.major = major;
        }

        public String getSchool() {
            return school;
        }
        public void setSchool(String school) {
            this.school = school;
        }

        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;
        }

        @Override
        public String toString() {
            return this.major + " at " + this.school;
        }
    }

    // Create a public static inner class called Experience, according to the specifications.
    public static class Experience {
        String jobTitle;
        int fromYear;
        int toYear;

        public Experience(String jobTitle, int startYear, int endYear) {
            this.jobTitle = jobTitle;
            this.fromYear = startYear;
            this.toYear = endYear;
        }

        @Override
        public String toString() {
            return this.fromYear + "-" + this.toYear + ": " + this.jobTitle;
        }
    }


    // Create a member variable of type Person (exactly as in task 2)
    private Person person;

    // Create a List to hold values of type Education (exactly as in task 2)
    private List<Education> educationList;

    // Create a Priority Queue that holds values of type Experience.
    private PriorityQueue<Experience> experiencePriorityQueue;






    /* TODO */
//Same two inner classes and member variables as in task 3.
    public Resume(Person p){
/* TODO */
//Same initialization of Person and the List of Education objects
 /* TODO */
//Initialize the priority queue in one line, without importing the Comparator interface.

        this.person = p;
        this.educationList = new ArrayList<>();
        this.experiencePriorityQueue = new PriorityQueue<>((experience1, experience2) -> experience2.toYear - experience1.toYear);}
/* TODO */
//The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()

    public PriorityQueue<Experience> getExperience() {
        return this.experiencePriorityQueue;
    }

    public void addExperience(Experience experience) {
        this.experiencePriorityQueue.add(experience);
    }

    public void addEducation(Education education) {
        this.educationList.add(education);
    }

    @Override
    public String toString() {
        return this.person.toString() +
                "\nExperience\n" + this.experiencePriorityQueue +
                "\nEducation\n" + this.educationList;
    }


}
