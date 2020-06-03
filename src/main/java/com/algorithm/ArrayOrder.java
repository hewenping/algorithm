package com.algorithm;

public class ArrayOrder {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 5, 6, 7,2,2,5,3,18};
        int num = 2;
        int arrLength=0;
        for(int orderNum:nums){
            if(orderNum!=num){
                nums[arrLength]=orderNum;
                arrLength++;
            }
        }
        for(int orderNum:nums){
            System.err.println(orderNum);
        }
        int ans = nums.length;
        for (int i = 0; i < ans;) {
            if (nums[i] == num) {
                nums[i] = nums[ans - 1];
                ans--;
            } else {
                i++;
            }
        }
        System.err.println(ans);
        for(int orderNum:nums){
            System.err.println(orderNum);
        }
    }



}
