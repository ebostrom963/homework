
public class StringMethods {
    public static void main(String[] args) {
        System.out.print(alternateStrings("Hi", "There"));
    }

    public static boolean abcTest(String text) {
        int location = text.indexOf("abc");
        if (location == 0) {
            return true;
        }
        if (location == -1
                || text.substring(location - 1, location).equals(".")) {
            return false;
        }
        return true;
    }

    public static String alternateStrings(String word1, String word2) {
        String output = "";
        int shortestLength = getLengthOfSmallestString(word1, word2);
        for (int i = 0; i < shortestLength; i++) {
            output = output + word1.substring(i, i + 1);
            output = output + word2.substring(i, i + 1);
        }
        output = output
                + getLargerString(word1, word2).substring(shortestLength);
        return output;

    }

    public static int getLengthOfSmallestString(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return word1.length();
        }
        return word2.length();

    }

    public static String getLargerString(String word1, String word2) {
        if (word1.length() > word2.length()) {
            return word1;
        }
        return word2;

    }

}
