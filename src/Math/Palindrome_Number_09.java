package Math;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:19
 * @Version 1.0
 */
public class Palindrome_Number_09 {
    public boolean isPalindrome(int x){
        if (x < 0)
            return false;
        int cur = 0;
        int num = x;
        while (num != 0){
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }
}
