## Задача 1

Нужно сделать удаление, чтение и добавление заметок потокобезопасным - 1 балл за выполненую задачу. 
Лучше всего использовать ReentrantReadWriteLock и синхронизировать только критические секции.

```java
public class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
        
        public void readNote(int index) {
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
            String note;
            note = notes.get(index);
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
        }
    }
```

## Задача 2
### Singleton

В этот раз познакомимся с паттерном [Singleton](https://refactoring.guru/ru/design-patterns/singleton) ([javarush](https://javarush.ru/groups/posts/589-patternih-i-singleton--dlja-vsekh-kto-vpervihe-s-nimi-stolknulsja))
Код ниже не потокобезопасен - мы можем создать два экземпляра Singleton из-за долгой инициализации, а такого быть не должно. 
Нужно это исправить. Как именно - на ваше усмотрение. 
За правильно решенную задачу - 1 балл. 
Еще 1 балл, если сделаете и потокобезопасно, и оптимально по скорости (чтобы потоки не "голодали"). 
Гугл в помощь со вторым пунктом :)

```java
public final class Singleton {
    private static Singleton instance;
    String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
```

## Задача 3
### Игра

Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name) и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.

О коде ниже:
1 List<String> steps хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
2. isWinnerFound показывает, найден победитель или нет.
3. Метод sleep выбрасывает InterruptedException и принимает параметр типа long.
4. Игроки играют независимо друг от друга.
5. Реализуйте логику метода run так, чтобы для каждого игрока:
- Через равные интервалы времени (1000ms / rating) выводились в консоль действия, описанные в steps.
- Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.

Пример:
Player 1:Начало игры

```java
public class Game {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            //Ваш код
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Здесь может и должен быть ваш код
             
            }
    }
}
```

Критерии:
- Метод run класса Gamer через равные интервалы времени (1000ms / rating) должен выводить в консоль фамилию игрока (метод getName()), потом двоеточие, а затем текст из OnlineGame.steps. Пример: Player1:Начало игры
-	Когда все игровые шаги будут выполнены, а победитель еще не найден, метод run должен установить флаг OnlineGame.isWinnerFound в true (сообщить остальным, что он победитель).
-	Если игрок стал победителем, его метод run должен вывести надпись getName() + ":победитель!". Например: Player 2:победитель!
-	Методы run всех игроков которые не стали победителями (были прерваны), должны вывести надписи getName() + ":проиграл". Например: Player 2:проиграл
-	Метод run не должен кидать исключение при прерывании.

За каждый выполненный критерий 1 балл.

## Итого 8 баллов за ДЗ.
## Срок сдачи - 11.11.20 23:59
