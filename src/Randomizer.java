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
}
