package CentralDiffusion;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:09
 * @Version 1.0
 */
public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
        int maxLen = 0;
        int[] res = new int[2];
        for (int i = 0; i < len; i++){
            int[] odd = centerSparead(s,i,i);
            int[] even = centerSparead(s,i,i+1);
            int[] max = odd[1] > even[1] ? odd:even;
            if (max[1] > maxLen){
                res = max;
                maxLen = max[1];
            }
        }
        return s.substring(res[0], res[0] + res[1]);
    }

    private int[] centerSparead(String s, int left, int right){
        int len = s.length();
        while (left >= 0 && right < len){
            if (s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }else {
                break;
            }
        }
        return new int[]{left + 1, right - left - 1};
    }
}
