package duck.color.size;

import duck.color.YellowDuck;

public class YellowSmallDuck extends YellowDuck {
    String size = "Small";

    @Override
    public String toString() {
        return "YellowSmallDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}
