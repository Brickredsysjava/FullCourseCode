package LeetCode;

import java.util.HashMap;

public class problem2 {

    /*public static boolean isSubstring(String a, String b){

        HashMap<Character, Character> m = new HashMap<>();
        *//*char c = 'a';
        for(int i=0; i<a.length(); i++){
            if(m.containsKey(a.charAt(i))){
            }
        }*//*
        int j=0;
        for(int i=0; i<a.length();i++){
            if(b.charAt(j) == a.charAt(i)){
                j++;
            }
        }
        return true;
    }*/
    public static void main(String[] args) {
        String s = "ahbcdf";
        String a = "abc";

       /* String[] p = s.split("");
        String[] n = a.split("");

        char[] p1 = s.toCharArray();
        char[] n1 = a.toCharArray();

*/
        //System.out.println(isSubstring(s, a));
        /*if(s.contains(a)){
            System.out.println();
        }*/
        int j=0;
        int flag =0;
        for(int i=0; i<s.length();i++){
            System.out.println("This is in i "+ i);
            System.out.println("________________________________");
            if(j < a.length()) {
                if (a.charAt(j) == s.charAt(i)) {
                    System.out.println("This is in j " + j);
                    j++;
                }
            }
            System.out.println("I am here----------");



        }

        System.out.println("This is jjjjjjjjjjjjjjjjjjjjjjjj");
        System.out.println(j);
        if(j == a.length()){
            System.out.println("yes it is what it is");
        }

    }
}
