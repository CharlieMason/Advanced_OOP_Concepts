public class Task {
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        Runnable racer1 = new/* TODO
Create a racer with c1 */
        Racer(c1);
        Runnable racer2 = new Racer(c2);

        /* TODO:
Create two threads using "new Thread" and pass  one Runnable
to each thread.  It is your job to figure out which are the Runnables.*/

        Thread thread1 = new Thread(racer1);
        Thread thread2 = new Thread(racer2);
        thread1.start();
        thread2.start();
    }
}