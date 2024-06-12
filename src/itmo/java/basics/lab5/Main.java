package itmo.java.basics.lab5;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLongestWord("Lorem ipsum dolor sit amet"));
        System.out.println(isPalindrome("Муха! О, муха! Велика аки лев! Ах, ум! О ах, ум!"));
        System.out.println(isPalindrome("Lorem ipsum dolor sit amet"));
        System.out.println(replaceText("Ты бяка", "бяка", "«[вырезано цензурой]»"));
        System.out.println(findOccurrencesQuantity("Lorem ipsum dolor sit amet", "Lorem ip"));
        System.out.println(findOccurrencesQuantity("Lorem ipsum dolor sit amet", "o"));
        System.out.println(invertWords("Lorem ipsum dolor sit amet"));
    }

    public static String findLongestWord(String text) {
        String result = "";
        String[] words = text.split(" ");

        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }

        return result;
    }

    public static boolean isPalindrome(String text) {
        String preparedText = text.replaceAll("[^А-Яа-яёA-Za-z]", "").toLowerCase();
        StringBuilder reversedText = new StringBuilder(preparedText);

        return preparedText.contentEquals(reversedText.reverse());
    }

    public static String replaceText(String text, String pattern, String replacement) {
        return text.replaceAll(pattern, replacement);
    }

    private static int findOccurrencesQuantity(String string, String subString) {
        return (string.length() - string.replaceAll(subString, "").length()) / subString.length();
    }

    public static String invertWords(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
}
