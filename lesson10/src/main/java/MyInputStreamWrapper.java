import java.io.IOException;
import java.io.InputStream;

public class MyInputStreamWrapper extends InputStream {
    private final InputStream inputStream;

    public MyInputStreamWrapper(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        System.out.println("This is wrapper method");
        return inputStream.read();
    }

    @Override
    public long skip(long l) throws IOException {
        System.out.println("This is wrapper method");
        return inputStream.skip(l);
    }

    @Override
    public int available() throws IOException {
        System.out.println("This is wrapper method");
        return inputStream.available();
    }

    @Override
    public void close() throws IOException {
        System.out.println("This is wrapper method");
        inputStream.close();
    }
}
