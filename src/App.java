import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Randomizer randomizer = new Randomizer();
        Fish fish1 = new Fish(randomizer.randomFishName(), randomizer.randomInt(1, 10), randomizer.randomDouble(0.5, 5.0));

        System.out.println(fish1);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        User user = new User(name);

        System.out.println("Welcome, " + user.getName() + "! Welcome to the Fishing Machine. You can catch fish and add them to your inventory. Let's start fishing!");

        while (true) { 
            System.out.println("Type 'fish' to catch a fish, 'inventory' to view your inventory, or 'exit' to quit.");
            String input = scanner.nextLine();
            if (input == null) input = "";
            String cmd = input.trim();
            if (cmd.equalsIgnoreCase("fish")) {
                Fish fish = new Fish(randomizer.randomFishName(), randomizer.randomInt(1, 10), randomizer.randomDouble(0.5, 5.0));
                user.addToInventory(fish.toString());
                System.out.println("You caught a " + fish.getName() + "! Its age is " + fish.getAge() + "years old and it weighs " + fish.getWeight() + " kg.");
            } else if (cmd.equalsIgnoreCase("inventory")) {
                for (int i = 0; i < user.getInventory().size(); i++) {
                    String item = user.getInventory().get(i);
                    if (item != null) {
                        System.out.println((i + 1) + ". " + item);
                    }
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
