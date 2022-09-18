package duck.color;

import duck.Duck;

public class WhiteDuck extends Duck {
    String behaviour;
    String engine;
    String color;
    String size;

    protected WhiteDuck(String size) {
        super("White", "Swing and Fly", "3");
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
        return "WhiteDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }

}
