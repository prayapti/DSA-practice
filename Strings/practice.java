//Q What will be the output of the following code?

public class Solution {
    public static void main(String args[]) {
        String str = "ShriyaDidi";
        String str1 = "College";
        String str2 = "ShriyaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}

🔍 Explanation:

str.equals(str1) → "ShriyaDidi".equals("College") → false

str.equals(str2) → "ShriyaDidi".equals("ShriyaDidi") → true

  Output:
false true
