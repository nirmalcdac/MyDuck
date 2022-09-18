package duck.color;

import duck.Duck;

public class GreenDuck implements Duck {
    String behaviour = "Swing and Walk";
    Integer engine = 1;

    @Override
    public String toString() {
        return "GreenDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
