package visitor;

public interface Insuranceble {
    <T> T accept(Visitor<T> visitor);
}
