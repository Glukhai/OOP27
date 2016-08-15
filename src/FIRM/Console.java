package FIRM;


import java.util.Scanner;

public class Console  {
    public static void main(String[] args) {
        Firm firma = new Firm("Khrechatik 9b", "Pupkin&Co", 10_000);

    System.out.println("Выберите пункт:");
        System.out.println("1 - добавить нового рабочего" +   "2- Уволить сотрудника по имени и фамилии" );
        System.out.println("Выберите пункт меню:");
        System.out.println ("[1] Добавить сотрудника");
        System.out.println ("[2] Уволить сотрудника");
        System.out.println ("[3] Перевести сотрудника в отдел");
        System.out.println ("[4] Вывести список всех сотрудников");
        System.out.println ("[5] Вывести список всех сотрудников отсортированных по ЗП");
        System.out.println ("[6] Вывести список всех сотрудников отсортированных по Фамилии");
        System.out.println ("[7] Вывести список всех сотрудников в отделе");
        System.out.println ("[8] Вывести список всех сотрудников в отделе по фамилии ");
        System.out.println ("[9] Вывести список всех сотрудников в отделе по ЗП ");
        System.out.println ("[10] Продавцам продать на 10 000 грн ");
        System.out.println ("[11] Выдать всем сотрудникам ЗП ");

    Scanner scan = new Scanner(System.in);
    int select = scan.nextInt();

    switch (select){
        case 1:
            System.out.println("Введите имя");
            String name = scan.next();
            System.out.println("Введите фамилию");
            String surname= scan.next();
            System.out.println("Введите отчество");
            String midleName= scan.next();
            System.out.println("Введите отдел");
            String department= scan.next();
            System.out.println("Введите пол");
            String gender= scan.next();
            System.out.println("Введите оклад сотрудника");
            int salary= scan.nextInt();
            Employee employee = new Employee(name, surname,midleName,department,0, gender, salary);
            firma.addEmployee(employee);
            System.out.println("Вы успешно добавили сотрудника");
            break;
        case 2:
            System.out.println("Введите имя");
            String name1 = scan.next();
            System.out.println("Введите фамилию");
            String surname1= scan.next();
            firma.fireEmployee(name1,surname1);
        case 3:
            System.out.println("Введите имя");
            String name3 = scan.next();
            System.out.println("Введите фамилию");
            String surname3= scan.next();
            System.out.println("Введите отчество");
            String midleName3= scan.next();
            System.out.println("Введите отдел");
            String department3= scan.next();
            firma.setDepartmentForEmployee(name3,surname3,midleName3,department3);
            break;
        case 4:
            break;

        case 5:
            break;

        case 6:
            break;
        case 7:
            break;
        case 8:
            break;
        case 9:
            break;
        case 10:
            break;
        case 11:
            firma.getAllEmployees();
            break;
    }
    }
}