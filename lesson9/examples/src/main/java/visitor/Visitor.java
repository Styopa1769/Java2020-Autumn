package visitor;

public interface Visitor {
    void visit(Court court);
    void visit(Factory factory);
    void visit(House house);
}
