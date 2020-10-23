# Задание 7
Для начала создадим поток двумя способами, каждый в своем классе, экземпляры каждого класса создать и запустить в классе Main.

## Задача 1
### Runnable

Создать свой поток, реализовав интерфейс Runnable.
Он должен выводить "This is runnable thread" при запуске.

#### 0,5 балла за успешное решение и запуск в Main.

## Задача 2
### Thread

Создать свой поток, отнаследовавшись от Thread.
Он должен выводить "This is extended thread" при запуске.

#### 0,5 балла за успешное решение и запуск в Main.

## Задача 3
### Часы

Нужно создать класс MyClock, который будет потоком. 
Переопределить в нем метод run() таким образом, чтобы каждые 500 мс (0,5 с) на консоль выводилось "Tik", затем через такой же интервал "Tak", затем снова "Tik" и так до тех пор, пока поток не прерван.
В классе Main нужно создать экземпляр потока, стартовать его, "усыпить" main на 50 с (5000 мс), затем прервать(остановить) поток.

#### Разбалловка:
- 1 балл за класс MyClock и за правильную обработку остановки потока
- 1 балл за main

## Задача 4
### Скачки

Скачки и прочие гонки хорошо иллюстрируют многопоточность. Реализуйте метод, который будет считать количество лошадей, пришедших к финишу. 
И ещё, нужно обязательно подождать, пока аутсайдеры также закончат гонку.

Реализуйте метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Нужно использовать метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. 
2.3. Не считать такую лошадь финишировавшей.

```java
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //напишите тут ваш код
        
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
```

#### Разбалловка: 
все работает - 2 балла



