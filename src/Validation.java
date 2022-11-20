public class Validation {

    public static String validName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else
        return name;
    }

    public static int validCost(Integer cost) {
        if (cost == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else
            return cost;
    }

    public static int validAmount(Integer amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else
            return amount;
    }

    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public static boolean isLogPassValid(String s) {
        String allowedSymbols = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz0123456789_";
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!allowedSymbols.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}
