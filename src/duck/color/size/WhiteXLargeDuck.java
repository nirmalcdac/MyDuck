package duck.color.size;

import duck.color.WhiteDuck;

public class WhiteXLargeDuck extends WhiteDuck {
    String size = "XLarge";

    @Override
    public String toString() {
        return "WhiteXLargeDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}
