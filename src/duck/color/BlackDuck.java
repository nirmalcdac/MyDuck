package duck.color;

import duck.Duck;

public class BlackDuck implements Duck {
    String behaviour = "Swing and Fly";
    Integer engine = 3;

    @Override
    public String toString() {
        return "BlackDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
