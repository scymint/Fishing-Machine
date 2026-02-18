import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Randomizer randomizer = new Randomizer();

        Fish fish1 = new Fish(randomizer.randomFishName(), randomizer.randomPrice(0, 100), randomizer.randomInt(1, 10),
                randomizer.randomDouble(0.5, 5.0));

        System.out.println(fish1);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        User user = new User(name);
        Rod basicRod = new Rod("Basic Rod", 20.0, "A basic fishing rod.", "Fishing Rod", 1.0, 1.0);
        user.setRod(basicRod);

        Shop shop = new Shop("Fishing Shop");
        shop.addItem(basicRod);

        Rod advancedRod = new Rod("Advanced Rod", 50.0, "An advanced fishing rod with better performance.",
                "Fishing Rod",
                2.0, 2.0);
        shop.addItem(advancedRod);

        Rod proRod = new Rod("Pro Rod", 100.0, "A professional fishing rod with the best performance.",
                "Fishing Rod", 3.0, 3.0);
        shop.addItem(proRod);

        System.out.println("Welcome, " + user.getName()
                + "! Welcome to the Fishing Machine. You can catch fish and add them to your inventory. Let's start fishing!");

        while (true) {
            System.out.println(
                    "Type 'fish' to catch a fish, 'inventory' to view your inventory, 'shop' to view the shop, \n'balance' to view your balance, 'buy' to buy an item, 'sell' to sell an item, 'equip' to equip a rod, or 'exit' to quit.");
            String input = scanner.nextLine();
            if (input == null)
                input = "";
            String cmd = input.trim();

            if (cmd.equalsIgnoreCase("fish")) {

                Fish fish = new Fish(randomizer.randomFishName(), randomizer.randomPrice(0, 100),
                        randomizer.randomInt(1, 10),
                        randomizer.randomDouble(0.5, 5.0));
                user.addToInventory(fish);
                System.out.println("You caught a " + fish.getName() + "! Its age is " + fish.getAge()
                        + " years old and it weighs " + fish.getWeight() + " kg. Its price is $" + fish.getPrice());

            } else if (cmd.equalsIgnoreCase("inventory")) {
                for (int i = 0; i < user.getInventory().size(); i++) {
                    ArrayList<Item> inventory = user.getInventory();
                    if (inventory == null) {
                        System.out.println("Your inventory is empty.");
                        break;
                    }
                    Item item = inventory.get(i);
                    if (item != null) {
                        System.out.println((i + 1) + ". " + item);
                    }
                }

            } else if (cmd.equalsIgnoreCase("shop")) {

                ArrayList<Item> items = shop.getItems();
                if (items == null) {
                    System.out.println("The shop is empty.");
                    break;
                } else {
                    System.out.println(
                            "Welcome to the " + shop.getName() + "! Here are the items available for purchase:");

                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                }

            } else if (cmd.equalsIgnoreCase("balance")) {
                System.out.println("Your current balance is: $" + user.getMoney());
            } else if (cmd.equalsIgnoreCase("buy")) {
                System.out.println("Enter the number of the item in the shop that you want to buy:");
                String itemIndexStr = scanner.nextLine();
                try {
                    int itemIndex = Integer.parseInt(itemIndexStr);
                    shop.buyItem(user, itemIndex);
                    System.out.println("You have successfully bought " + shop.getItems().get(itemIndex - 1).getName() + ". Your current balance is: $" + user.getMoney());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid item number.");
                }

            } else if (cmd.equalsIgnoreCase("sell")) {
                System.out.println("Enter the number of the item in your inventory that you want to sell:");
                String itemIndexStr = scanner.nextLine();
                try {
                    int itemIndex = Integer.parseInt(itemIndexStr);
                    String itemName = user.getInventory().get(itemIndex - 1).getName();
                    shop.sellItem(user, itemIndex);
                    System.out.println("You have successfully sold " + itemName + ". Your current balance is: $" + user.getMoney());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid item number.");
                }
            } else if (cmd.equalsIgnoreCase("equip")) {
                System.out.println("Enter the number of the rod in your inventory that you want to equip:");
                String itemIndexStr = scanner.nextLine();
                try {
                    int itemIndex = Integer.parseInt(itemIndexStr);
                    Item item = user.getInventory().get(itemIndex - 1);
                    if (item instanceof Rod) {
                        user.setRod((Rod) item);
                        System.out.println("You have successfully equipped " + item.getName() + ".");
                    } else {
                        System.out.println("Invalid input. Please enter a valid rod number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid rod number.");
                }
            } else if (cmd.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}
