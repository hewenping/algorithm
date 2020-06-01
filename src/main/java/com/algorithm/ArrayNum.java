package com.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayNum {
    public static void main(String[] args) {
        Integer []a = new Integer[]{1,8,10,3,9,4,7,11,12,16};
        Integer num=9;
        Arrays.sort(a);
        int z=0;
        //将数组倒序  排除大于9的对象
        for(int i=0;i<a.length;i++){
            if(a[i]>=num){
                z=i;
            }
        }
        int l=0;
        int k=0;
        for(int i=0;i<z;i++){
            for(int j=0;j<z;j++){
                if(a[i]+a[j]==num){
                    l=i;
                    k=j;
                }
            }
        }
        if(a[l]+a[k]==num){
            System.err.println("在数组中的索引为"+l+"------"+k);
        }

       //最优算法
        //先用结果值减去 数组值 判断map值里该元素是否存在  若不存在则存入map中 若存在则将拿出对应的value值即为索引 和数组中对象的索引
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(num-a[i])){
                int []b = new int[]{map.get(num-a[i]),l};
            }
            map.put(a[i],i);
        }

    }
}
