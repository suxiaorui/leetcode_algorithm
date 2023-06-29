package HashTable;

import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:00
 * @Version 1.0
 */
public class Longest_Substring_Without_Repeating_Characters_03 {
    public int lengthOfLongestSubstring(String S){
        char[] s = S.toCharArray();
        int[] cnt = new int[128];
        int res = 0, l = 0, n = s.length;
        for (int r = 0; r < n; r++){
            char c = s[r];
            ++cnt[c];
            while(cnt[c] > 1){
                --cnt[s[l++]];
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
