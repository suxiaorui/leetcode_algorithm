package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 10:32
 * @Version 1.0
 */

public class Two_Sum_01 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> hashmap=  new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target - nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Two_Sum_01 two_sum_01 = new Two_Sum_01();
        int[] res = two_sum_01.twoSum(nums, target);
        for(int i = 0; i < res.length;i++){
            System.out.println(res[i]);
        }
    }
}
