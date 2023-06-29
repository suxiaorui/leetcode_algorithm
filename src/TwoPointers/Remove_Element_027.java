package TwoPointers;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/6/29 11:44
 * @Version 1.0
 */
public class Remove_Element_027 {
    public int removeElement(int[] nums, int val){
        int n = nums.length;
        int left = 0, right = n;
        while (left < right){
            if (nums[left] == val){
                nums[left] = nums[--right];
            }else{
                left++;
            }
        }
        return left;
    }
}
