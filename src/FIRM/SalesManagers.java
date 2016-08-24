package FIRM;

import java.util.ArrayList;

/**
 * Created by Note on 14.08.2016.
 */
public class SalesManagers extends Employee {
    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    private float sale;

 public SalesManagers(String name, String surname, String midleName, String department, int count, String gender, int salary, float sale ){
    super(name, surname, midleName, department, count, gender, salary);


}

public String toString() {
    return  super.toString() +
            ", sale = " + sale + '}';
}


}
