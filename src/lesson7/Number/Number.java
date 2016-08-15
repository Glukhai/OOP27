package lesson7.Number;

import com.sun.org.apache.xpath.internal.SourceTree;

//1. Написать класс число (Number), хранящий целое число и выполняющий следующие операции:
//- получение примитива (метод int get())
//- сложение (метод Number add(Number num))
//- вычитание (метод Number sub(Number num))
//- умножение (метод Number mul(Number num))
//- деление (метод Number div(Number num))
//- возведение в степень (метод Number pow(Number exponent))
//- вычисление факториала (метод Number fact())
//- вычисление остатка от деления (метод Number mod(Number num))
public class Number {

    int number ;

  public  Number(int number) {
      this.number = number;
    }

    int get(){
        return  this.number;
    }

    Number add(Number num)  {
    return new Number(this.number + num.get());
    }
    public static void main(String[] args) {
        int x=5;
        Number number = new Number(x);
        System.out.println(number.get());
        //System.out.println(number.add(10));

    }


}
