import java.util.ArrayList;
import java.util.*;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        /* TODO 
Initialize the objects variable*/
        this.objects = new ArrayList<>();
    }
    /* TODO 
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/
    public void add(T obj) throws BagException {
        if (obj == null)    throw new BagException("Cannot add null to Bag");
        objects.add(obj);
    }

 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/
 public T drawOne() {
     // get a random Index
     int index = new Random().nextInt(this.objects.size());
     // return the element at given index
     return (this.objects.get(index));
 }

    public ArrayList<T> drawMany(int howMany){
/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
        ArrayList<T> items = new ArrayList<>();
        for (int i = 0; i < howMany; i++) items.add(drawOne());
        return (items);
    }

    public void add(T element,double prob) throws BagException{

        if (element == null)    throw new BagException("Cannot add null to Bag");

        if (prob < 0 || prob > 1)   throw new BagException("Probability should be between 0 and 1");

        // This is a way to add elements in a given proportion.
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
