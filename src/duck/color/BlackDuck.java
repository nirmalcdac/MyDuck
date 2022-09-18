package duck.color;

import duck.Duck;

public class BlackDuck extends Duck {
    String behaviour;
    String engine;
    String color;
    String size;
    protected BlackDuck(String size) {
        super("Black", "Swing and Fly", "3");
        this.size = size;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BlackDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
