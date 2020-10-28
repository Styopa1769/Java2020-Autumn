## Задача 1
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования к программе:
1. Программа не должна считывать значения с клавиатуры.
2. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
3. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
4. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
5. Метод printMap() должен выводить Map на экран.
6. В методе main вызван createMap, над ним выполнена операция removeTheFirstNameDuplicates(), Map выведена с помощью printMap().

Как будет выглядеть ваша программа (название класса на ваше усмотрение):
```java
public static Map<String, String> createMap() {
  //напишите тут ваш код
}

public static void removeTheFirstNameDuplicates(Map<String, String> map) {
  //напишите тут ваш код
}

public static void removeItemFromMapByValue(Map<String, String> map, String value) {
  //напишите тут ваш код
}

public static void printMap(Map<String,String> map){
  //напишите тут ваш код
}

public static void main(String[] args) {
  //напишите тут ваш код
}
```

### Разбалловка:
1. реализован createMap() - 0,5б
2. реализован removeItemFromMapByValue() - 1б
3. реализован removeTheFirstNameDuplicates() - 1б
4. реализован printMap() - 0,5б
5. реализован main() - 0,5б

## Задача 2 (дополнительная)
Написать свой шифратор/дешифратор для [шифра Цезаря](https://ru.wikipedia.org/wiki/%D0%A8%D0%B8%D1%84%D1%80_%D0%A6%D0%B5%D0%B7%D0%B0%D1%80%D1%8F) при помощи Map. Решения без Map приниматься не будут.
Подсказывать не буду - баллы дополнительные, подумайте сами, как реализовать :)
```java
public class CaesarCodec implements Coder {
    
    public CaesarCodec(int key){
      //конструктор
    }
    
    // здесь ваш код
}
```
где Coder:
```java
public interface Coder {
    String decode(String input);

    String encode(String input);
}
```
### Разбалловка:
1. все работает - 3 балла
