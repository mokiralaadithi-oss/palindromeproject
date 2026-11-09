public class Palindrome {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "")
                            .toLowerCase();

        String reversed =
            new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a word!");
            return;
        }

        String word = String.join(" ", args);

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome!");
        }
    }
}