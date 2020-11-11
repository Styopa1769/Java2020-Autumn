package visitor;

public class House implements Insuranceble {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
