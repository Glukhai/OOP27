package Lesson8;

import java.security.PublicKey;

/**
 * Created by Note on 15.08.2016.
 */
public class rectangle extends Figure {
    int a;
    int b;

    public rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area (){
        return a*b;

    }

    @Override
    public double perimeter(){
        return (a+b)*2;

    }

    @Override
    public String getname(){
        return "Rectangle";

    }


}
