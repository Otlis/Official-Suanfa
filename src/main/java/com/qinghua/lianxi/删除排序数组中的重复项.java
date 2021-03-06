package com.qinghua.lianxi;

public class 删除排序数组中的重复项 {
    public static void main(String[] args) {
        //给定一个排序的数组  移除重复的元素 返回新数组的长度
        int[] arr = new int[]{1, 1, 2, 2, 3, 4, 5};
        System.out.println(removeDuplicates(arr));
    }

    public void method(int[] nums) {
        //动态更新数组
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
    }


    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }


    public static int removeDuplicates2(int[] nums) {
        if (nums == null) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] == nums[q]) {
                q++;
            } else {
                p++;
                nums[p] = nums[q];
                q++;
            }
        }

        return p + 1;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

}
