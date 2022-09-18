package duck.color;

import duck.Duck;

public class GreenDuck extends Duck {
    String behaviour;
    String engine;
    String color;
    String size;
    protected GreenDuck(String size) {
        super("Green", "Swing and Walk", "1");
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
        return "GreenDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
