public class Fish extends Item {
    private int age;
    private double weight;
    
    public Fish(String name, double price, String description, int age, double weight) {
        super(name, price, description);
        this.age = age;
        this.weight = weight;
    }
    
    public Fish(String name, double price, int age, double weight) {
        super(name, price, "Its just a fish");
        this.age = age;
        this.weight = weight;
    }

    public Fish(String name, int age, double weight) {
        super(name,0.0,"Its just a fish");
        this.age = age;
        this.weight = weight;
    }

    public Fish(String name) {
        super(name, 0, "Its just a fish");
        this.age = 0;
        this.weight = 0.0;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", age: " + age + " years old, weight: " + weight + " kg, price: $" + super.getPrice();
    }
}
