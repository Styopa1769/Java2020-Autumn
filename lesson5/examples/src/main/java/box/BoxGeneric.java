package box;

public class BoxGeneric<T, S> {
    private T firstValue;
    private S secondValue;

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public S getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(S secondValue) {
        this.secondValue = secondValue;
    }

    private static <T, S> boolean compare(BoxGeneric<T, S> boxGeneric1, BoxGeneric<T, S> boxGeneric2){
        return boxGeneric1.getFirstValue().hashCode() > boxGeneric2.getFirstValue().hashCode();
    }

    private static void foo(BoxGeneric<Number, Number> numberBoxGeneric1, BoxGeneric<Number, Number> numberBoxGeneric2){
        System.out.println(numberBoxGeneric1.getFirstValue().intValue() < numberBoxGeneric2.getFirstValue().intValue());
    }

    private static void fooFoo(BoxGeneric<?, ?> numberBoxGeneric1, BoxGeneric<?, ?> numberBoxGeneric2){
        System.out.println(numberBoxGeneric1.getFirstValue().hashCode() < numberBoxGeneric2.getFirstValue().hashCode());
    }

    public static void main(String[] args) {
        BoxGeneric<String, Integer> box = new BoxGeneric<>();

        box.setFirstValue("value");
        String value = box.getFirstValue();
        box.setSecondValue(new Integer(0));
        Integer i = box.getSecondValue();

        System.out.println(value);

        // так будет работать
        BoxGeneric<Number, Number> numberBoxGeneric = new BoxGeneric<>();
        numberBoxGeneric.setFirstValue(new Integer(0));
        numberBoxGeneric.setSecondValue(new Double(0));

        // так не будет работать
        BoxGeneric<Integer, Integer> integerBoxGeneric = new BoxGeneric<>();
        //foo(integerBoxGeneric);
    }
}
