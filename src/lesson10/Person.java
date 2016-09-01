package lesson10;

/**
 * Created by Note on 16.08.2016.
 */
public class Person {
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String name;
    String surname;
    int age;

@Override
public  String toString(){
    return String.format("%s,%s,$d",name,surname,age);

}
}

