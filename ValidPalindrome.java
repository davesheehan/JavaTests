/*


 Solution: traverse from both side.
 */
 public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\W", "");
        System.out.println(s);
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;   
    }
}