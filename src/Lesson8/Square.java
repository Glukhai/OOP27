package Lesson8;

/**
 * Created by Note on 15.08.2016.
 */
public class Square extends rectangle {

    public Square(int a, int b) {
        super(a, a);
    }

    @Override
    public double area (){
        int b = (this.a)*4;
        return  b;

    }

    @Override
    public double perimeter(){
        return 4*(this.a );

    }



}
