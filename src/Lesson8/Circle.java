package Lesson8;

/**
 * Created by Note on 15.08.2016.
 */
public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
@Override
    public double area(){
    return Math.PI*(radius*2);


}

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String getname() {
        return null;
    }
}
