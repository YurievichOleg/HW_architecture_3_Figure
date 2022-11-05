public class Triangle extends Figure{

    public Paint location2;
    public Paint location3;
    public Triangle(Paint location1, Paint location2, Paint location3){
        if ( (location1.x == location2.x && location2.x == location3.x) || (location1.y == location2.y && location2.y == location3.y)){
            throw new IllegalArgumentException("Не верные вводные данные. Проверьте координаты вершин треугольника");
        }
        super.location = location1;
        this.location2 = location2;
        this.location3 = location3;
    }

    @Override
    protected double perimeter() {
        double l1 = Math.sqrt(Math.pow((location.x - location2.x),2) + Math.pow((location.y - location2.y),2));
        double l2 = Math.sqrt(Math.pow((location2.x - location3.x),2) + Math.pow((location2.y - location3.y),2));
        double l3 = Math.sqrt(Math.pow((location.x - location3.x),2) + Math.pow((location.y - location3.y),2));
        return l1 + l2 + l3;
    }

    @Override
    protected double area() {
        double halfPerimeter = perimeter() / 2;
        double l1 = Math.sqrt(Math.pow((location.x - location2.x),2) + Math.pow((location.y - location2.y),2));
        double l2 = Math.sqrt(Math.pow((location2.x - location3.x),2) + Math.pow((location2.y - location3.y),2));
        double l3 = Math.sqrt(Math.pow((location.x - location3.x),2) + Math.pow((location.y - location3.y),2));
        return Math.sqrt(halfPerimeter * (halfPerimeter - l1) * (halfPerimeter - l2) * (halfPerimeter - l3));
    }
}
