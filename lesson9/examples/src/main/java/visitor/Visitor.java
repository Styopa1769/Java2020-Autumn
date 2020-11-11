package visitor;

public interface Visitor<T> {
    T visit(Court court);
    T visit(Factory factory);
    T visit(House house);
}
