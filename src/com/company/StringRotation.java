package com.company;

public class StringRotation {
    public static void main(String []args){
        String s1="abhishek";
        String s2="ekabhish";
        System.out.println(isRotation(s2,s1));

    }

    private static boolean isRotation(String s2, String s1) {
        if(s2.length()==s1.length()&&s1.length()>0){
            String newstring =s2+s2;
            return isSubstring(s1,newstring);

        }
        return false;
    }

    private static boolean isSubstring(String s1, String newstring) {
        for(int i=0;i<newstring.length();i++){
            String sub=newstring.substring(i);
            if(sub.contains(s1)){return true;}
        }
        return false;
    }
}
