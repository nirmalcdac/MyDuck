package duck;

public abstract class Duck {
    String behaviour;
    String engine;
    String color;
    protected Duck(String color, String behaviour, String engine){
        this.color = color;
        this.behaviour = behaviour;
        this.engine = engine;
    }
}