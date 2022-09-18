package duck.color.size;

import duck.color.BlackDuck;

public class BlackMediumDuck extends BlackDuck {
    String size;

    public BlackMediumDuck() {
        super("Medium");
    }
    @Override
    public String toString() {
        return "BlackMediumDuck{" +
                "size='" + size + '\'' +
                "} " + super.toString();
    }
}