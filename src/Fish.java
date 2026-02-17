public class Fish {
    private String name;
    private int age;
    private double weight;
    
    public Fish(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Fish(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", weight: " + weight + " kg";
    }
}
