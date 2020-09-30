package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String inputstring="abcda";
        System.out.print(isUniquechars(inputstring));
    }
    public static boolean isUniquechars(String inputstring){
        boolean []unique=new boolean[128];
        if(inputstring.length()>128)return false;
        for(int i=0;i<inputstring.length();i++){
            if(unique[inputstring.charAt(i)-'a'])return false;
            else{
                unique[inputstring.charAt(i)-'a']=true;
            }
        }
        return true;
    }
}
