package duck.color.size;

import duck.color.WhiteDuck;

public class WhiteMediumDuck extends WhiteDuck {
    String size = "Medium";

    @Override
    public String toString() {
        return "WhiteMediumDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}
