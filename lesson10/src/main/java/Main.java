import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/home/styopa/java2020/Java2020-Autumn/lesson10/src/main/resources/file.txt";

        try(InputStream is = new FileInputStream(path)) {
            int i;
            while ((i = is.read()) != -1) {
                System.out.write((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            StringBuilder sb = new StringBuilder();
            while (br.ready()){
                sb.append(br.readLine());
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.err.println(br.lines().collect(Collectors.joining(", ")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
