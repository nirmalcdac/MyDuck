package duck.color;

import duck.Duck;

public class YellowDuck implements Duck {
    String behaviour = "Swing";
    @Override
    public String toString() {
        return "YellowDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine=" + engine +
                '}';
    }

    Integer engine = 0;
}
