package visitor;

public class Manager implements Visitor {
    @Override
    public void visit(Court court) {
        System.out.println("Court");
    }

    @Override
    public void visit(Factory factory) {
        System.out.println("Factory");
    }

    @Override
    public void visit(House house) {
        System.out.println("House");
    }
}
