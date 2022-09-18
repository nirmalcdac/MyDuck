package duck.color.size;
import duck.color.GreenDuck;
public class GreenLargeDuck extends GreenDuck {
    String size = "Large";

    @Override
    public String toString() {
        return "GreenLargeDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}