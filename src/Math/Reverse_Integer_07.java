package Math;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:15
 * @Version 1.0
 */
public class Reverse_Integer_07 {
    public int reverse(int x){
        long res = 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int)res : 0;
    }
}
