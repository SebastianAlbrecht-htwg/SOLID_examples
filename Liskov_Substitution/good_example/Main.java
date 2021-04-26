public class Main {
    public static void main(String[] args) {
        // Square s = new Square();
        // setDimensions(s, 5, 4);
        Rectangle r = new Rectangle();
        setDimensions(r, 5, 4);
    }

    public static void setDimensions(Rectangle e, double width, double height){
        e.setHeight(height);
        e.setWidth(width);
        assert e.width * e.height == width * height; 
    }
}

