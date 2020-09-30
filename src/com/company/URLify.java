package com.company;

public class URLify {
    public static void main(String[] args) {
        //String inputString = "Mr John Smith JJ";

        //urlify(inputString);
        char[]inputarray={'M','r',' ','j','o','h','n',' ','S','M','i','t','h','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        urlify2pass(inputarray,13);

    }

    //one pass solution put is creating new string
    public static void urlify(String inputstring) {
        System.out.println(inputstring.replaceAll("\\s", "%20"));
    }

    public static void urlify2pass(char[] inputstring,int tlength) {
        int countspace = 0;

        for (int i = 0; i < tlength; i++) {
            if (inputstring[i]== ' ') {
                countspace++;

            }


        }
       int index = tlength + countspace * 2;
        if(index<tlength)inputstring[index]='\0';
        for(int i=tlength-1;i>=0;i--){
        if(inputstring[i]==' '){
            inputstring[index-1]='0';
            inputstring[index-2]='2';
            inputstring[index-3]='%';
            index=index-3;

        }
        else{
            inputstring[index-1]=inputstring[i];
            index--;
        }
        }
        for (char c : inputstring) {
            System.out.print(c);
        }

    }

}
