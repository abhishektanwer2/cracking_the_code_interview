package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class PermutationPalindrome {
    public static void main(String []args){
        String inputstring="aba aba";
        System.out.print(isPermutationPalindrom(inputstring));

    }
    public static boolean isPermutationPalindrom(String inputstring){
        String input=inputstring.replaceAll("\\s","").toLowerCase();
      LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }
            else{
                map.put(input.charAt(i),1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
int count=0;
        while (it.hasNext()) {
            Map.Entry<Character, Integer> set = it.next();

            if(set.getValue()%2==1){
                count++;
            }
            else{
                count--;
            }

        }


        return count<=1;
    }
}
