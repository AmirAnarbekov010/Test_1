public class Main {
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), 0));
        System.out.println(permission(generateRandomAge(), 30));
    }
}
