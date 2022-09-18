package duck.color.size;

import duck.color.YellowDuck;

public class YellowXSmallDuck extends YellowDuck {
    String size = "XSmall";

    @Override
    public String toString() {
        return "YellowXSmallDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}
