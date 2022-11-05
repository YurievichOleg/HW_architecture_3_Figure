public class Circle extends Figure{

    public int radius;

    public Circle(Paint location, int radius){
        if (radius < 0 ){
            throw new IllegalArgumentException("Не верные вводные данные. Радиус не может иметь отрицательное значение");
        }
        super.location =location;
        this.radius = radius;
    }

    @Override
    protected double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    protected double area() {
        return 3.14 * Math.pow(radius, 2);
    }
}
