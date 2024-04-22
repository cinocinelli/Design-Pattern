package Factory;

public class Main {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        Shape shape = shapeFactory.getShape(1);
        shape.draw();
    }
}
