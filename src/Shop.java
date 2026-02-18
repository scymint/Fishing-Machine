import java.util.*;
public class Shop {
    private String name;
    private ArrayList<Item> items;
    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public String getItemList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            sb.append((i + 1) + ". " + items.get(i) + "\n");
        }
        return sb.toString();
    }

    public void buyItem(User user, int itemIndex) {
        if (itemIndex < 1 || itemIndex > items.size()) {
            System.out.println("Invalid item index.");
            return;
        }
        Item item = items.get(itemIndex - 1);
        if (user.getMoney() >= item.getPrice()) {
            user.rmvMoney(item.getPrice());
            user.addToInventory(item);
            System.out.println("You bought " + item.getName() + " for $" + item.getPrice());
        } else {
            System.out.println("You don't have enough money to buy this item.");
        }
    }

    public void sellItem(User user, int inventoryIndex) {
        if (inventoryIndex < 1 || inventoryIndex > user.getInventory().size()) {
            System.out.println("Invalid inventory index.");
            return;
        }
        Item item = user.getInventory().get(inventoryIndex - 1);
        if (item != null) {
            user.addMoney(item.getPrice() / 2);
            user.getInventory().remove(inventoryIndex - 1);
            System.out.println("You sold " + item.getName() + " for $" + item.getPrice() / 2);
        } else {
            System.out.println("Invalid inventory index.");
        }
    }

    @Override
    public String toString() {
        return "Shop: " + name + ", Items: " + items;
    }
}
