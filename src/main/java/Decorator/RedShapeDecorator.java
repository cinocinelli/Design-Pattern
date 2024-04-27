package Decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
//        除调用包装类的方法同时调用本类特有方法
        setColor();
    }
    public void setColor(){
        System.out.println("Set Color: Red");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("circle");
        circle.draw();

        System.out.println("\nredCircle");
        redCircle.draw();

        System.out.println("\nredRectangle");
        redRectangle.draw();

    }
}
