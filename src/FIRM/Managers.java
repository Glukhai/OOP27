package FIRM;
public class Managers extends Employee {
    private double bonus;
    private String department;

    public Managers(String name, String surname, String midleName, String department, int count, String gender, int salary) {
        super(name, surname, midleName, department, count, gender, salary);
    }

    public double getBonus() {
        return bonus;
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}

///добавить ссылку на обьект на департамента!!!