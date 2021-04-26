public class Square implements GrahpicElement{

    double height;
    double width;
    
    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }
}
