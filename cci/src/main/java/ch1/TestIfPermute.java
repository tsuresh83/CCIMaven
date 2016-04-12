/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author suresh
 */
public class TestIfPermute {
    public static void main(String[] args){
        String src = "this";
        String target = "siht";
        boolean b = checkIfPermute(src, target);
        System.out.println(b);
    }
    private static boolean checkIfPermute(String src, String target){
        HashMap<Character,Integer> srcMap = getCharCountMap(src);
        HashMap<Character,Integer> targetMap = getCharCountMap(target);
        if(srcMap.size()!=targetMap.size()){
            return false;
        }
        Set<Character> srcKeys = srcMap.keySet();
        Set<Character> targetKeys = targetMap.keySet();
        if(!srcKeys.containsAll(targetKeys) ||
                !targetKeys.containsAll(srcKeys)){
            return false;
        }
        for(char c : srcKeys){
            if(srcMap.get(c).intValue()!=targetMap.get(c).intValue()){
                return false;
            }
        }
        return true;
    }
    private static HashMap<Character,Integer> getCharCountMap(String input){
        HashMap<Character,Integer> charCtMap = new HashMap();
        char[] charArray = input.toCharArray();
        for(char c : charArray){
            if(charCtMap.containsKey(c)){
                charCtMap.put(c, charCtMap.get(c)+1);
            }else{
                charCtMap.put(c,1);
            }
        }
        return charCtMap;
    }
    
}
