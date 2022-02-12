/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape{
    private double length;
    public Square(double length, String name){
        super(name);
        this.length=length;
    }
    public void setLength(double l){
        this.length = l;
    }
    public double getLength(){
        return (this.length);
    }
    @Override
    public double getArea(){
        double ar = this.length * this.length;

        return(ar);
    }

    @Override
    public double getPerimeter(){
        double pm = 4 * (this.length);

        return(pm);
    }

    @Override
    public boolean chkequals(Object ob){
        if (ob == this) {
           return (true);
        }
        if (!(ob instanceof Square)){
            return (false);
            Square ob = (Square) ob;
            return (ob.length == this.length && ob.name.equals(this.name));
        }
    }

    @Override
    public String toString() {
        return (this.name + ":" + this.length);

    }
}