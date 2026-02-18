import java.util.*;
public class User {
    private String name;
    final ArrayList<Item> inventory;
    private Rod rod;
    private double money;

    public User(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.money = 100.0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Rod getRod() {
        return rod;
    }

    public double getMoney() {
        return money;
    }

    public void setRod(Rod rod) {
        this.rod = rod;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addMoney(double amount) {
        this.money += amount;
    }

    public void rmvMoney(double amount) {
        if (money >= amount) {
            this.money -= amount;
        } else {
            System.out.println(name + ", you don't have enough money!");
        }
    }

    public void addToInventory(Item item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == null) {
                inventory.set(i, item);
                return;
            }
        }
        inventory.add(item);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Inventory: " + inventory + ", Rod: " + rod;
    }
}
