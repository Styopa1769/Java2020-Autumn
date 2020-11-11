package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // обходим файловое дерево при помощи нашего посетителя
        MyFileVisitor fileVisitor = new MyFileVisitor();
        String path = "/home/styopa/java2020/Java2020-Autumn/lesson9/examples/src/main/resources/";
        Files.walkFileTree(Paths.get(path), fileVisitor);
        System.out.println(fileVisitor.getTexts());


        // читаем содержимое файла, затем выводим результат и пишем его в другой файл
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(new File(path, "text.txt"))) {

            int i;
            while ((i = fis.read()) != -1) {
                stringBuilder.append((char) i);
            }
        }

        String content = stringBuilder.toString();
        System.out.println(content);

        try (FileOutputStream fos = new FileOutputStream(new File(path, "text1.txt"))) {

            char[] chars = content.toCharArray();
            for (char c : chars){
                fos.write(c);
            }
        }
    }
}
