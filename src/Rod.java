public class Rod {
    private String type;
    private double length;
    private double strength;

    public Rod(String type, double length, double strength) {
        this.type = type != null ? type : "Basic Rod";
        this.length = length;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getStrength() {
        return strength;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public String toString() {
        return "Type: " + type + ", length: " + length + ", strength: " + strength;
    }
}
