package duck.color;

import duck.Duck;

public class RedDuck extends Duck {
    String behaviour;
    String engine;
    String color;
String size;
    protected RedDuck(String size) {
        super("Red", "Swing and Walk", "1");
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
    @Override
    public String toString() {
        return "RedDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
