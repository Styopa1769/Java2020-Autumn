package visitor;

public class Factory implements Insuranceble {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
