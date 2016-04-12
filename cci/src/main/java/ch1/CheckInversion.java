/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.util.Arrays;

/**
 *
 * @author suresh
 */
public class CheckInversion {
    public static void main(String[] args){
        String s1 = "water";
        String s2 = "water";
        boolean inverted = checkIfInverted(s1,s2);
        System.out.println(inverted);
    }
    private static boolean checkIfInverted(String s1, String s2){
        boolean inverted = true;
        if(s1 == null || s2 == null ||
                s1.length()!=s2.length()){
            return false;
        }
        char startChar = s1.charAt(0);
        int indexOfStartCharInS2 = s2.indexOf(startChar);
        char[] midToEnd = Arrays.copyOfRange(s2.toCharArray(), indexOfStartCharInS2, s2.length());
        char[] startToMid = Arrays.copyOfRange(s2.toCharArray(), 0, indexOfStartCharInS2);
        StringBuilder builder = new StringBuilder();
        builder.append(new String(midToEnd)).append(startToMid);
        System.out.println(builder);
        return builder.toString().contains(s1);
    }
}
