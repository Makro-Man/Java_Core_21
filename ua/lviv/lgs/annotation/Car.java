package ua.lviv.lgs.annotation;

public class Car {
    @MyAnnotation("Your car name")
    private String name;
    @MyAnnotation("Car color")
    private String color;
    @MyAnnotation("Its good")
    private double engine;
    @MyAnnotation("Its cool")
    private String model;

    public Car(String name, String color, double engine, String model) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }
}
