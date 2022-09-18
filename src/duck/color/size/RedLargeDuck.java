package duck.color.size;

import duck.color.RedDuck;

public class RedLargeDuck extends RedDuck {
    String size = "Large";

    @Override
    public String toString() {
        return "RedLargeDuck{" +
                super.toString()+
                "size='" + size + '\'' +
                '}';
    }
}
