public class ShapeFactory extends AbstractFactory {
    // use getShape method to get object of type Shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) { return null; }
        
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
       
        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Circle();
        
        return null;
    }
    
    // since we extend abstract factory we have to implement getColor
    // but since we have no need for it, we can just return null
    @Override
    Color getColor(String color) {
        return null;
    }
}
