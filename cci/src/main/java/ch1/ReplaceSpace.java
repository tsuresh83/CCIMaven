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
public class ReplaceSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = " this   is        ";
        char[] chars = s.toCharArray();
        int trueLength = s.trim().length();
        int lastCharAdjacentToSpaceIndex = trueLength-1;
        int endOfReplacementIndex = s.length()-1;
        int curPosition = trueLength-1;
        while(curPosition>=0){
            if(chars[curPosition]==' '){
                int tmp = endOfReplacementIndex;
                for(int ctr=tmp;ctr>endOfReplacementIndex-(lastCharAdjacentToSpaceIndex-curPosition);ctr--){
                    chars[endOfReplacementIndex]=chars[lastCharAdjacentToSpaceIndex];
                    lastCharAdjacentToSpaceIndex--;
                    endOfReplacementIndex--;
                }
                chars[endOfReplacementIndex-2]='%';
                chars[endOfReplacementIndex-1]='2';
                chars[endOfReplacementIndex]='0';
                endOfReplacementIndex-=3;
                lastCharAdjacentToSpaceIndex=curPosition-1;
            }
            curPosition--;
        }
        System.out.println(new String(chars));
    }
   
    private static int countSpaces(char[] input, int trueLength){
        int nSpaces = 0;
        for(int i=0;i<trueLength;i++){
            if(input[i]==' '){
                nSpaces++;
            }
        }
        return nSpaces;
    }
    
}
