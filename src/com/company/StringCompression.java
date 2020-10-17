package com.company;

public class StringCompression {
    public static void main(String[]args){
        String input="aaa";
        String result=CompressedStringBilder(input);
                //CompressedString(input);
        System.out.print(result);

    }

    private static String CompressedString(String input) {
        String compressed="";
        int count=0;
        for(int i=0;i<input.length();i++)
        {count++;
        if(i+1>=input.length() ||input.charAt(i)!=input.charAt(i+1)){
            compressed+= ""+input.charAt(i)+""+count;
            count=0;
        }

        }


        return compressed.length()>input.length()?input:compressed;

    }
    private static String CompressedStringBilder(String input) {
        StringBuilder compressed=new StringBuilder();
        int count=0;
        for(int i=0;i<input.length();i++)
        {count++;
            if(i+1>=input.length() ||input.charAt(i)!=input.charAt(i+1)){
                compressed.append(input.charAt(i));
                compressed.append(count);
                count=0;
            }

        }


        return compressed.length()>input.length()?input:compressed.toString();

    }
}
