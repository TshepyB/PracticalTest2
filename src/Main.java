public class Main {

    public static void longest(String[] strings) {
        if (strings == null || strings.length == 0) {
            System.out.println("The array is empty.");
            return;
        }


        String longestStr = strings[0];

        for (String str : strings) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }

        System.out.println("Longest string: " + longestStr);
    }

    public static void main(String[] args) {

        String[] wordArray = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        longest(wordArray);
    }
}

