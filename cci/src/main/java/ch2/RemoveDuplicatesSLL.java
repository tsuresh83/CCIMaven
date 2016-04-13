/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author suresh
 */
public class RemoveDuplicatesSLL {
    public static void main(String[] args){
        int[] input = new int[]{4,3,4,2,3,4};
        SingleLinkedList list = new SingleLinkedList(0);
        for(int i : input){
            list.add(i);
        }
        //list.printList();
        list = removeDuplicatesWithoutBuffer(list);
        list.printList();
    }
    static SingleLinkedList removeDuplicatesWithBuffer(SingleLinkedList list){
        HashSet<Integer> entries = new HashSet<Integer>();
        SingleLinkedList current = list;
        SingleLinkedList previous = null;
        while(current != null){
            if(entries.contains(current.getData())){
                previous.setNext(current.getNext());
            }else{
                entries.add(current.getData());
                previous = current;
            }    
            current = current.getNext();
        }
        return list;
    }
    static SingleLinkedList removeDuplicatesWithoutBuffer(SingleLinkedList list){
        SingleLinkedList current = list;
        SingleLinkedList runner = null;
        SingleLinkedList runnerPrevious = null;
        while(current != null){
            runnerPrevious = current;
            runner = current.getNext();
            while(runner !=null){
                if(runner.getData() == current.getData()){
                    runnerPrevious.setNext(runner.getNext());
                }else{
                    runnerPrevious = runner;
                }
                runner = runner.getNext();
            }
            current = current.getNext();
        }
        return list;
    }
    private static HashMap<Integer,Integer> getCounts(SingleLinkedList list){
        HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();
        SingleLinkedList tmp = list;
        if(tmp == null){
            return counts;
        }
        while(tmp != null){
            if(counts.containsKey(tmp.getData())){
                counts.put(tmp.getData(),(counts.get(tmp.getData()))+1);
            }else{
                counts.put(tmp.getData(),1);
            }
            tmp = tmp.getNext();
        }
        return counts;
    }
}
class Counts{
    ArrayList<Integer> data,counts;
}