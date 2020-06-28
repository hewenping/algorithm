package com.yawn.test;

public class NewWindow {
    public static void main(String[] args) {
        int[]  nums = new int []{2,3,1,2,4,3};
        System.err.println(minSubArrayLen(7,nums ));
    }

     static int minSubArrayLen(int s, int[] nums) {
        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        //指针向右移动
        while (hi < nums.length) {
            //开始计算
            sum += nums[hi++];
            while (sum >= s) {
            //大于或等于对应值时
            //当前长度值和上一个长度值进行比较 取最小值
                min = Math.min(min, hi - lo);
            //将队列头弹出
                sum -= nums[lo++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
