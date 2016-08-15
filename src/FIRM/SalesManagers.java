package FIRM;

import java.util.ArrayList;

/**
 * Created by Note on 14.08.2016.
 */
public class SalesManagers extends Employee {
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    private int sale;

 public SalesManagers(String name, String surname, String midleName, String department, int count, String gender, int salary ){
    super(name, surname, midleName, department, count, gender, salary);


}

}
