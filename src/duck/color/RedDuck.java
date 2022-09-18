package duck.color;

import duck.Duck;

public class RedDuck implements Duck {
    String behaviour = "Swing and Walk";
    Integer engine = 1;
    @Override
    public String toString() {
        return "RedDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
