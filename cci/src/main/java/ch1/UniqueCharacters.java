/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author suresh
 */
public class UniqueCharacters {
    public static void main(String[] args){
        String s ="this";
        char[] c = s.toCharArray();
        boolean b = checkIfUnique(c);
        System.out.println(b);
        b = checkIfUniqueMap(c);
        System.out.println(b);
    }
    private static boolean checkIfUniqueMap(char[] input){
        HashSet<Character> ctMap = new HashSet();
        for(char c : input){
            if(ctMap.contains(c)){
                return false;
            }
            ctMap.add(c);
        }
        return true;
    }
    private static boolean checkIfUnique(char[] input){
        int[] asciiArray = new int[128];
        Arrays.fill(asciiArray, 129);
        for(char i : input){
            if(asciiArray[(int)i]==129){
                asciiArray[(int)i]=(int)i;
            }else{
                return false;
            }
        }
        return true;
    }
}
