package com.google;

public class Ass1 {
    public static void main(String[] args) {

        String myStr="JavaSkills";

        for(int i=myStr.length()-1; i>=0; i--)//last index of string is its length-1 and first index starts with o
        {
            System.out.print(myStr.charAt(i));
        }
    }
}
