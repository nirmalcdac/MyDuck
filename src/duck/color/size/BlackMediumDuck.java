package duck.color.size;
import duck.color.BlackDuck;
public class BlackMediumDuck extends BlackDuck {
    String size = "Medium";
    @Override
    public String toString() {
        return "BlackMediumDuck{" +
                super.toString() +
                "size='" + size + '\'' +
                '}';
    }
}