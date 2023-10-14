public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1=new ShapeFactory();

        Shape shape1=shapeFactory1.getShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapeFactory1.getShape("RECTANGLE");
        shape2.draw();


        Shape shape3=shapeFactory1.getShape("SQUARE");
        shape3.draw();
    }
}
