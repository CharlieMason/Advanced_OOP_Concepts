public class Task {
    public static void main(String[] args){
/* TODO */
//Copy the Task from task 2 here and add experiences where the end years are not in order. Watch it print the resume with the dates in order from most recent to least.
                Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        // Create an education object. School is NEIU, major is Computer Science.
        Resume.Education education = r. new Education("NEIU", "Computer Science");

        // add this education object to the resume "r"
        r.addEducation(education);

        // Create a new Experience object and add it to the resume.
        r.addExperience(new Resume.Experience("VP of Sales", 2018, 2019));
        r.addExperience(new Resume.Experience("HR of XYZ", 2021, 2022));
        System.out.println(r); //watch the resume print.
    }
}