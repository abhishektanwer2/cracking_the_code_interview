package com.company;

public class CheckPermutation {
    public static void main(String []args){
        String s1="aba";
        String s2="abc";
        System.out.print(isPermutationStrin(s1,s2));
    }
    public static boolean isPermutationStrin(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int[]hash=new int[128];
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            hash[s2.charAt(i)]--;
            if(hash[s2.charAt(i)]<0)return false;
        }
        return true;
    }
}
