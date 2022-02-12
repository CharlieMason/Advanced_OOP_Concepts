public interface Diagnosable {
    double getTemperature();
/* TODO *//*
Declare a hasFever method that reutrns true is the temperature
is greater than 100.4 */
    default boolean hasFever(){
        if(getTemperature() > 100.4 )
            return (true);
        else
            return (false);
    }
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
/* TODO *//*
Decleare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types.*/
    void setSystolic(int systolic);
    void setDiastolic(int diastolic);

}
