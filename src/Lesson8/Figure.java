package Lesson8;

/**
 * Created by Note on 15.08.2016.
 */
public abstract    class  Figure  {
    public abstract double area ();
    public abstract double perimeter ();
    public abstract String getname();
    @Override
    public String toString() {
        return String.format("perim :%5.2f , area: %f", perimeter(), area());
    }
}
