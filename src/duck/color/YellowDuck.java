package duck.color;

import duck.Duck;

public class YellowDuck extends Duck {
    String behaviour;
    String engine;
    String color;
    String size;
    protected YellowDuck(String size) {
        super("Yellow", "Swing", "0");
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
        return "YellowDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}