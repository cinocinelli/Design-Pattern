package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String cos){
        if (cos.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if (cos.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
