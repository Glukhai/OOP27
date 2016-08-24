package FIRM;

import java.util.Comparator;

public class Employee {
   public static final Comparator <Employee> BY_SaLARY = (p1,p2) -> Float.compare(p1.salary,p2.salary);

//    enum Gender{male,female }; // уточнить Enum;
    private String name;
    private String surname;
    private String midleName;
    private String department;
    private int count;
    private String gender;
    private int salary;

   public String getDepartment() {
        return department;
    }

    public int getCount() {
        return count;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Employee(String name, String surname, String midleName, String department, int count, String gender, int salary) {
        this.name = name;
        this.surname = surname;
        this.midleName = midleName;
        this.department = department;
        this.count = count;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return "\nEmployee {" + "\n" +
                "surname = '"+ surname + '\'' +
                "name = '" + name + '\'' +
                "salary '" + midleName + '\'' +
                "gender '" + gender + '\'' +
                "count '" + count + '\'' +
                "salary '" + salary + '\'' +
                "department '" + department + '\'' + '}';



    }

}

