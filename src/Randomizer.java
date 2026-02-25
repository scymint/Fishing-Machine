
public class Randomizer {
    public static int randomInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static double randomDouble(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public static String randomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = randomInt(0, characters.length() - 1);
            result.append(characters.charAt(index));
        }
        return result.toString();
    }

    public static String randomFishName() {
        String[] fishNames = {"Salmon", "Trout", "Bass", "Catfish", "Pike", "Carp", "Perch", "Walleye"};
        int index = randomInt(0, fishNames.length - 1);
        return fishNames[index];
    }

    public static double randomPrice(double min, double max) {
        double val = Math.round((Math.random() * (max - min) + min) * 100.0) / 100.0;
        if (val <= 0.0) {
            val = 0.01;
        }
        return val;
    }

    public static String randomType(User user) {
        String[] stats = {"Small", "Medium", "Large", "Huge"};
        int index = randomInt(0, stats.length - 1);
        return stats[index];
    }

    public static double randomWeight(double min, double max) {
        return Math.round((Math.random() * (max - min) + min) * 100.0) / 100.0;
    }

    public static int randomStatMultiplier(User user) {
        if (user == null || user.getRod() == null) return 1;
        String[] stats = {"Small", "Medium", "Large", "Huge"};
        int index = randomInt(0, stats.length - 1);
        int multiplier = (int) Math.round((index + 1) * user.getRod().getStrength() * user.getRod().getLength());
        if (multiplier < 1) multiplier = 1;
        return multiplier;
    }

    public static double priceFromWeight(double weight, User user) {
        double basePerKg = 10.0;
        int multiplier = randomStatMultiplier(user);
        double randomFactor = 0.8 + Math.random() * 0.4; // between 0.8 and 1.2
        double price = weight * basePerKg * multiplier * randomFactor;
        price = Math.round(price * 10.0) / 100.0;
        if (price <= 0.0) price = 0.01;
        return price;
    }
}
