package files;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    private final List<String> texts = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if(path.toString().endsWith(".txt"))
            texts.add(path.toString());
        return FileVisitResult.CONTINUE;
    }

    public List<String> getTexts() {
        return texts;
    }
}
