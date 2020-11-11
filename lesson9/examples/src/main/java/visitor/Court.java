package visitor;

public class Court implements Insuranceble {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
