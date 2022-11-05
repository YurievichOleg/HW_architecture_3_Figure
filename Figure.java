abstract class Figure implements Comparable<Figure>{
    public Paint location;


    protected abstract double perimeter();

    protected abstract double area();

    @Override
    public int compareTo(Figure o){
        return (int) (this.area() * 100 - o.area() * 100);
    }

}
