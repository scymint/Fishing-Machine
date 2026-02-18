public class Rod extends Item {
    private String type;
    private double length;
    private double strength;

    public Rod(String name, double price, String description, String type, double length, double strength) {
        super(name, price, description);
        this.type = type != null ? type : "Basic Rod";
        this.length = length;
        this.strength = strength;
    }

    public Rod(String name, double price, String type, double length, double strength) {
        super(name, price, "A fishing rod");
        this.type = type != null ? type : "Basic Rod";
        this.length = length;
        this.strength = strength;
    }

    public Rod(String name, double price, String type) {
        super(name, price, "A fishing rod");
        this.type = type != null ? type : "Basic Rod";
        this.length = 1.0;
        this.strength = 1.0;
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

    @Override
    public String toString() {
        return "name: " + super.getName() + ", price: $" + super.getPrice() + ", description: " + super.getDescription() + ", type: " + type + ", length: " + length + ", strength: " + strength;
    }
}
