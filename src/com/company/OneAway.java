package com.company;

public class OneAway {
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "balm";
        System.out.print(oneAway(s1, s2));

    }

    private static boolean oneAway(String s1, String s2) {
        int p1 = 0, p2 = 0;
        boolean dif = false;
        String bigString = s1.length() > s2.length() ? s1 : s2;
        String smallString = s1.length() > s2.length() ? s2 : s1;
        if (bigString.length() - smallString.length() > 1) return false;
        while (p1 < bigString.length() && p2 < smallString.length()) {

            if (bigString.charAt(p1) != smallString.charAt(p2)) {
                if (dif) return false;
                dif = true;
                if (bigString.length() == smallString.length()) p1++;

            }else {
                p1++;
            }
            p2++;

        }
        return true;
    }
}
