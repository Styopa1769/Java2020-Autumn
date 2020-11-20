## Задача 1
### Английские буквы
Написать метод, которому на вход будет приходить String имя файла, а на выходе будет int - количество английских букв в файле.
В этой задаче вам поможет табличка кодирования char в Java: ![табличка кодирования char в Java](https://i.stack.imgur.com/ocfbM.png).
Затем нужно вызвать данный метод в main методе.

### Разбалловка:
1. все работает - 2 балла

## Задача 2
### Адаптер
Реализуйте класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Например, "[User] : Table".

```java
public class Adapter {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "User";
            }

            @Override
            public String getTableName() {
                return "Table";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter {

    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
```

Класс TableAdapter должен реализовывать интерфейс BTable и иметь конструктор с параметром ATable.

### Разбалловка:
1. Написан класс TableAdapter - 1 б

## Задача 3
### Числа
Написать метод, принимающий два имени файла String.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Потоки должны быть в конце закрыты.

Затем в main считать с консоли 2 имени файла и вызвать написанный метод.

Пример тела файла (первый файл):
12 text var2 14 8ю 1

Результат (второй файл):
12 14 1

### Разбалловка:
1. все работает - 2 балла

## Задача 4
## Обертка
Используя шаблон проектирования [Wrapper (Decorator)](https://refactoring.guru/ru/design-patterns/decorator), расширить функциональность FileOutputStream.​
В классе MyFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:​
1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".​
2. Считайте строку.​
3. Если считанная строка равна (пожалуйста, не используйте ==) "Д", то закрыть поток.​
4. Если считанная строка не равна (пожалуйста, не используйте !=) "Д", то не закрывать поток.​

### Разбалловка:
1. все работает - 2 балла

Дедлайн - 23:59 27.11.20

