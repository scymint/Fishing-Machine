public class Item {
    private String name;
    private double price;
    private String description;
    private String type;

    public Item(String name) {
        this.name = name;
        this.price = 1.0;
        this.description = "No description available";
        this.type = "Generic Item";
    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.description = "No description available";
        this.type = "Generic Item";
    }

    public Item(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = "Generic Item";
    }

    public Item(String name, double price, String description, String type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", price: $" + price + ", description: " + description + ", type: " + type;
    }
}
