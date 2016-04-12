/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

/**
 *
 * @author suresh
 */
public class ReverseString {
    public static void main(String[] args){
        String s ="th";
        String rev = reverseString(s);
        System.out.println(rev);
    }
    private static String reverseString(String input){
        char[] charArray = input.toCharArray();
        int i=0,j=charArray.length-1;
        while(i<j){
            char tmp =charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}
