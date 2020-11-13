package visitor;

public interface Insurable {
    <T> T accept(Visitor<T> visitor);
}
