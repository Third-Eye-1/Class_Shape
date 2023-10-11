public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();
    abstract double getPerimeter();
}
