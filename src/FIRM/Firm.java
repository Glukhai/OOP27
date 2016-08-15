package FIRM;

import java.io.PrintStream;
import java.util.*;
import java.util.Arrays;



public class Firm extends Department {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalaryCount() {
        return salaryCount;
    }

    public void setSalaryCount(long salaryCount) {
        this.salaryCount = salaryCount;
    }

    public ArrayList<Employee> getFirmWorkers() {
        return firmWorkers;
    }

    public void setFirmWorkers(ArrayList<Employee> firmWorkers) {
        this.firmWorkers = firmWorkers;
    }

    private String name;
    private String adress;
    private long salaryCount;
    private ArrayList<Employee> firmWorkers; // = new ArrayList<Employee>(); // добавить в конструктор

    public Firm(String name, String adress, long salaryCount) {
        this.name = name;
        this.adress = adress;
        this.salaryCount = salaryCount;
        this.firmWorkers = new ArrayList<Employee>();

    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    boolean addEmployee(Employee employee) {
        if (firmWorkers.size() > 0) {
            for (Employee e : firmWorkers) {
                if (e.equals(e.getName()) && e.equals(e.getSurname())) {
                    System.out.println("Сотрудник уже числится на фирме " + e);
                    return false;
                    // if(e.name.equals(employee.name)&&
                }
            }
        }
        firmWorkers.add(employee);
        return true;
    }


    boolean fireEmployee(String name, String surname) {
        for (int i = 0; i < firmWorkers.size(); i++) {
            if (firmWorkers.get(i).getName().equals(name) && firmWorkers.get(i).getSurname().equals(surname)) {
                firmWorkers.remove(i);
                return true;
            } else {
                System.out.println("Нет такого сотрудника");
                return false;
            }
        }
        System.out.println("Нет такого сотрудника");
        return false;
    }

    void printAllEmployees() {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < firmWorkers.size(); i++) {
            System.out.printf(firmWorkers.get(i).getName() + " " + firmWorkers.get(i).getSurname() + " " + firmWorkers.get(i).getDepartment() + " " +
                    firmWorkers.get(i).getSalary() + " " + firmWorkers.get(i).getCount() + "\n");
//                System.out.printf("Имя=: %6s,Фамилия : %6s, отдел: %6s, З_П: %6i, счет: %6i,",
//                        firmWorkers.get(i).getName(), firmWorkers.get(i).getSurname(), firmWorkers.get(i).getDepartment()
//                        , firmWorkers.get(i).getSalary(), firmWorkers.get(i).getCount());

        }
    }

    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<Employee>(firmWorkers);
    }

    ArrayList<Employee> getAllEmployeesOrderedBySalary() {

        //ArrayList <Employee> cl = firmWorkers.clone(); /// почитать клонирование дин.списков
        //  Object clone = firmWorkers.clone();
        //  new ArrayList<Employee>() =  firmWorkers.clone(Arrays.sort(firmWorkers.get().getCount()) );
        ArrayList<Employee> firm1workers = firmWorkers; ///.ввернуть купию ссылки;
        return firm1workers;
    }

    void giveSalaryForAll() {
        System.out.println(salaryCount);
        for (Employee employee : firmWorkers) {
            employee.setCount(employee.getCount() + employee.getSalary());
            salaryCount = salaryCount - ((employee.getSalary()));
            //проверочка
            System.out.println(salaryCount);
            System.out.println(employee.getCount());

        }


    }



    boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName) {

      return true;
    }

    public void sellFor10() {

        for (Employee e : firmWorkers)
          {
            if (e.getDepartment().equals("Менеджер")) {

            }

        }
    }
    public static void main(String[] args) {
        Firm firma = new Firm("Khrechatik 9b", "Pupkin&Co", 10_000  );
        firma.adress = "Khrechatik 9b";
        firma.name = "Pupkin&Co";
        firma.salaryCount = 1_000_00;
        Employee empl1 = new Employee("Юлия", "Ладыгина", "Сергеевна", "Менеджер", 100, "female", 1000);
        Employee empl2 = new Employee("Юлия1", "Ладыгина1", "Сергеевна1", "работник", 100,"female",1000);
        Managers manager = new Managers("Юлия2", "Ладыгина3", "Сергеевна1", "Менеджер", 100, "female", 1000);
        firma.addEmployee(empl1);
        firma.addEmployee(empl2);
        firma.addEmployee(manager);
        System.out.println(firma.firmWorkers.size());
        firma.getAllEmployees();
        firma.giveSalaryForAll();
        firma.getAllEmployees();
    }
}


