package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("Name", "Stepan");
        map.put("Surname", "Shcherbakov");
        map.put("Age", 23);

        System.out.println(map.remove("Name"));

        for (Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }

    }
}
