package FIRM;

public class Employee {
     enum Gender{male,female }; // уточнить Enum;
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
      //  this.Gender = Gender;
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
}

