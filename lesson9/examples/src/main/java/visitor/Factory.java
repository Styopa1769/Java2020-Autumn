package visitor;

public class Factory implements Insuranceble {
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
