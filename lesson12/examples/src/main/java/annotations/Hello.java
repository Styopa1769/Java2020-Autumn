package annotations;

class Hello{
    @MyAnnotation(value=10)
    public void sayHello(){System.out.println("hello annotation");}
}
