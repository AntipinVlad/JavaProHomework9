public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        String filteredString = s.toLowerCase().replaceAll("[^a-z]", "");
        int length = filteredString.length() - 1;

        for (int i = 0; i < length; i++) {
            if (filteredString.charAt(i) != filteredString.charAt(length - i)) return false;
            if (i == length - i) return true;
        }

        return true;
    }
}
