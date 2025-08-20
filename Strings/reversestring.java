//without string builder problem 557 leetcode
public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            // Reverse each word using a for loop
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            result += reversedWord + " ";
        }

        // Remove extra space at the end
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String output = reverseWords(s);
        System.out.println(output);  // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
