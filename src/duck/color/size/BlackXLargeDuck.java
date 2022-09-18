package duck.color.size;
import duck.color.BlackDuck;
public class BlackXLargeDuck extends BlackDuck {
    String size = "XLarge";
    @Override
    public String toString() {
        return "BlackXLargeDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}
