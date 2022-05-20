package experiment.experiment4;

/**
 * @author 松哥
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;
    public GeometricObject()  {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A geometric object with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
