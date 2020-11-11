package visitor;

public class Manager implements Visitor<String> {
    @Override
    public String visit(Court court) {
        return "Court";
    }

    @Override
    public String visit(Factory factory) {
        return "Factory";
    }

    @Override
    public String visit(House house) {
        return "House";
    }
}
