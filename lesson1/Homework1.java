import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Homework1
{

    //ВАЖНО!
//модификаторы методов оставьте public - так нужно мне для тестов

    //посчитать факториал числа n
//0.5б - если посчитаете в цикле
//1б - если посчитаете рекурсией
    public static int fact(int n){
        if (n < 2){
            return 1;
        }
        else{
            return n * fact(n-1);
        }

    }

    //вывести таблицу умножения на экран - 1б
//подсказка - использовать двойной for
    public static void table(){
        for (int i =1; i < 10; i++){
            for (int j = 1; j < 10; j ++){
                if (j == 9){
                    System.out.println(i*j);

                }
                else{
                    System.out.print(i*j + " ");
                }
            }
        }
//Ваше решение здесь
    }

    //посчитать сумму цифр числа
//можно посчитать для трехзначного - 0.5б
//для любого числа - 1б
//подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int answer = 1;
        while (n / 10 >0){
            answer += (n %10);
            n = (n - (n % 10))/10;

        }
//Ваше решение здесь
        return answer;
    }

    //определить, является ли год високосным
//В високосном году - 366 дней, тогда как в обычном - 365.
//Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
//Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//Годы 2100, 2200 и 2300 - не високосные.
//за правильный ответ - 0.5б
    public static boolean isLeapYear(int year) {
//Ваше решение здесь
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;

                } else {
                    return false;
                }


            } else {
                return true;
            }

        } else {
            return false;
        }
    }
//здесь вам нужно будет использовать результат прошлой задачи
//и вывести, сколько дней в году
//правильный ответ - 0.5б
        public static int daysInYear(int year) {
            if (isLeapYear(year)){
                return 366;
//
            } else {
                return 365;
//
            }

        }

//определить номер дня недели по строке
//например: Понедельник - 1
//правильный ответ - 1б
    public static int dayOfTheWeek(String n) {
//Ваше решение здесь
        int a = 0;
        switch (n) {
            case "Понедельник":
                a = 1;
                break;
            case "Вторник":
                a = 2;
                break;
            case "Среда":
                a = 3;
                break;
            case "Четверг":
                a = 4;
                break;
            case "Пятница":
                a = 5;
                break;
            case "Суббота":
                a = 6;
                break;
            case "Воскресенье":
                a = 7;
                break;
        }
    return a;
    }

//вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
//правильное решение - 0.5б
        public static void printArray(int[] array){
//Ваше решение здесь
            System.out.println(Arrays.toString(array));
        }

//вывести двойной массив на экран в виде:
// [1, 5, 3, 7, 10, 2, 5]
// [1, 5, 3, 7, 10, 2, 5]
// ...
//правильное решение - 0.5б
        public static void printArray(int[][] array){
            for (int i = 0; i < array.length;i++){
                System.out.println(Arrays.toString(array[i]));
            }
//Ваше решение здесь
        }

//отсортировать одномерный массив в порядке возрастания
//если не знаете, как сортировать, то подсказка -
//метод пузырька (один из самых простых для понимания)
//правильный ответ - 1б
        public static int[] sort(int[] mas){
//Ваше решение здесь
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
            }
            return mas;
        }

//здесь можете тестировать свои решения
        public static void main(String[] args){
            System.out.println("Факториал:");
            System.out.println(fact(5));

            System.out.println("Таблица умножения:");
            table();

            System.out.println("Сумма цифр числа:");
            System.out.println(sum(12345));

            System.out.println("Дней в году:");
            System.out.println(daysInYear(2019));

            System.out.println("День недели:");
            System.out.println(dayOfTheWeek("Понедельник"));

            int[] array1D = {1,5,3,7,10,2,5};
            System.out.println("Вывод отсортированного массива:");
            printArray(sort(array1D));

            System.out.println("Вывод двумерного массива:");
            int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
            printArray(array2D);}
}
