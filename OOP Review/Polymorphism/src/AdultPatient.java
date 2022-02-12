import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable, Employable{

    double temperature;
    int systolic;
    int diastolic;

    ArrayList <String> jobs;

    @Override
    public double getTemperature() {
        return (temperature);
    }
    @Override
    public void setTemperature(double t) {
        this.temperature = t;
    }
    @Override
    public int getSystolic() {
        return (systolic);
    }
    @Override
    public void setSystolic(int sys){
        this.systolic = sys;
    }

    @Override
    public int getDiastolic(){
        return (diastolic);
    }
    @Override
    public void setDiastolic(int dis){
        this.diastolic = dis;
    }




    @Override
    public ArrayList<String> getPreviousJobs() {
        return (this.jobs);
    }

    @Override
    public void addJob(String job) {
        if (jobs== null)
            jobs = new ArrayList<String>();
        jobs.add(job);

    }
}// TODO
//Implement the class Adult Patient.
//An adult patient is a Person that is Diagnosable and that is Employable.






