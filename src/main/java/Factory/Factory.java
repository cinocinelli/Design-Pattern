package Factory;

public class Factory {
    public Shape getShape(int ShapeType){
        switch (ShapeType){
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            case 3:
                return new Square();
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        Shape shape = shapeFactory.getShape(1);
        shape.draw();
    }
}
