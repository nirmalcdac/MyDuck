package duck.color;

import duck.Duck;

public class WhiteDuck implements Duck {
    String behaviour = "Swing and Fly";
    Integer engine = 3;
    @Override
    public String toString() {
        return "WhiteDuck{" +
                "behaviour='" + behaviour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
