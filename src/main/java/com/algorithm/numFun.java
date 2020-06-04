package com.algorithm;

public class numFun {
    public static void main(String[] args) {
        int n=19;
        String num=n+"";
        int number=0;
        while(!num.equals("1")){
            for(int i=0;i<num.length();i++){
                System.err.println(num.charAt(i));
                number +=(num.charAt(i) - '0')*(num.charAt(i) - '0');
            }
            num=number+"";
            number=0;
        }
        System.err.println(num);
    }
}
