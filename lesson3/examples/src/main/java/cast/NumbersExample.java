package cast;

public class NumbersExample {
    public static void main(String[] args) {
        System.out.println("Сужаем:");
        long l = Long.MAX_VALUE;
        System.out.println("l="+l);
        System.out.println("binary l: "+Long.toBinaryString(l));

        int i = (int) l;
        System.out.println("i="+i);
        System.out.println("binary i: "+Integer.toBinaryString(i));

        short sh = (short) i;
        System.out.println("sh="+sh);

        byte b = (byte) sh;
        System.out.println("b="+b);

        System.out.println("Расширяем");
        sh = b;
        System.out.println("sh="+sh);

        i = sh;
        System.out.println("i="+i);
        System.out.println("binary i: "+Integer.toBinaryString(i));

        l = i;
        System.out.println("l="+l);
        System.out.println("binary l: "+Long.toBinaryString(l));
    }
}
