package common;

public class Apple {
    private Color color;
    private float weight;
    private String name;

    public Apple() {

    }

    public Apple(Color color, float weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
