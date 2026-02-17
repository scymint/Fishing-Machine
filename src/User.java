import java.util.*;
public class User {
    private String name;
    private ArrayList<String> inventory;
    private ArrayList<Rod> rods;
    private Rod rod;

    public User(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.rods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Rod> getRods() {
        return rods;
    }

    public Rod getRod() {
        return rod;
    }

    public void setRod(Rod rod) {
        this.rod = rod;
    }

    public void addRod(Rod rod) {
        for (int i = 0; i < rods.size(); i++) {
            if (rods.get(i) == null) {
                rods.set(i, rod);
                return;
            }
        }
        rods.add(rod);
    }

    public void setupRods() {
        for (int i = 0; i < rods.size(); i++) {
            if (rods.get(i) == null) {
                rods.set(i, new Rod("Basic Rod", 5.0, 10.0));
            }
        }
        rod = rods.get(0);
    }

    public void addToInventory(String item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == null) {
                inventory.set(i, item);
                return;
            }
        }
        inventory.add(item);
    }

    public String toString() {
        return "Name: " + name + ", Inventory: " + inventory + ", Rod: " + rod;
    }
}
