//leetcode easy 557 problem 
//with string builder 
public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }

        // Remove the last extra space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reversed = reverseWords(s);
        System.out.println(reversed);  // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
