public class Rectangle extends Figure{

    public int width;
    public int length;
    public Rectangle(Paint location, int width, int length){
        if ( width < 0 || length < 0){
            throw new IllegalArgumentException("Не верные вводные данные. Длина и ширина не могут принимать отрицательные значения");
        }

        super.location = location;
        this.width = width;
        this.length = length;
    }


    @Override
    protected double perimeter() {
        return width * 2 + length * 2;
    }

    @Override
    protected double area() {
        return width * length;
    }
}
